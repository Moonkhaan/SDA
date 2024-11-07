// Main.java
import java.util.Arrays;
import java.util.List;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Sample books
        List<BookGui> availableBooks = Arrays.asList(
                new BookGui("Effective Java", "Joshua Bloch", 45.0),
                new BookGui("Clean Code", "Robert C. Martin", 40.0),
                new BookGui("Design Patterns", "Erich Gamma", 50.0)
        );

        Customer customer = new Customer("Muneeb");
        customer.browseBooks(availableBooks);
        
        // Simulate adding books to cart and checking out
        customer.addToCart(availableBooks.get(0)); // Adding "Effective Java"
        customer.addToCart(availableBooks.get(1)); // Adding "Clean Code"
        customer.checkout();
    }
}
