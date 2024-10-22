import java.util.ArrayList;
import java.util.List;

// Subject class
class Subject {
   private List<Observer> observers = new ArrayList<>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   /** 
    * Detach method to remove an observer 
    */
   public void detach(Observer observer) {
      observers.remove(observer);
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         if (observer.isActive()) {  // Only notify active observers
            observer.update();
         }
      }
   } 	
}

// Observer abstract class
abstract class Observer {
   protected Subject subject;
   private boolean active = true;  // By default, observers are active

   public abstract void update();

   public boolean isActive() {
      return active;
   }

   public void activate() {
      this.active = true;
   }

   public void deactivate() {
      this.active = false;
   }
}

// BinaryObserver class
class BinaryObserver extends Observer {

   public BinaryObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
   }
}

// OctalObserver class
class OctalObserver extends Observer {

   public OctalObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
   }
}

// HexaObserver class
class HexaObserver extends Observer {

   public HexaObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
   }
}

// Main class to demonstrate the modified Observer pattern
public class Modify {
   public static void main(String[] args) {
      Subject subject = new Subject();

      // Creating observers and attaching them to the subject
      BinaryObserver binaryObserver = new BinaryObserver(subject);
      OctalObserver octalObserver = new OctalObserver(subject);
      HexaObserver hexaObserver = new HexaObserver(subject);

      // Changing state of subject and notifying active observers
      System.out.println("First state change: 15");	
      subject.setState(15);  // All observers are active and receive updates

      // Deactivating binaryObserver
      System.out.println("\nDeactivating BinaryObserver");
      binaryObserver.deactivate();

      // Changing state of subject again
      System.out.println("Second state change: 10");	
      subject.setState(10);  // Only OctalObserver and HexaObserver will receive updates
      
      // Re-activating binaryObserver
      System.out.println("\nActivating BinaryObserver");
      binaryObserver.activate();

      // Changing state of subject again
      System.out.println("Third state change: 5");
      subject.setState(5);  // All observers are active again and receive updates
   }
}
