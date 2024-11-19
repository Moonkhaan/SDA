package DAL;

public class AdmissionView implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer Notification: " + message);
    }

    public void displayCandidate(String candidateDetails) {
        System.out.println("Candidate Details:\n" + candidateDetails);
    }
}

