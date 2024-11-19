import Model.AdmissionController;
import GUI. EligibilityFilter;
import GUI.InterviewFilter;
import GUI.TestFilter;
import Model.Candidate;
import DAL.AdmissionView;

public class AdmissionSystem {
    public static void main(String[] args) {
        // Create 10 Candidates
        Candidate[] candidates = {
            new Candidate("Ali", 70, 60, 80),
            new Candidate("Sara", 85, 45, 75),
            new Candidate("Ahmed", 55, 65, 90),
            new Candidate("Maria", 90, 70, 60),
            new Candidate("Usman", 60, 50, 72),
            new Candidate("Aisha", 58, 52, 68),
            new Candidate("Hassan", 62, 55, 74),
            new Candidate("Fatima", 88, 80, 82),
            new Candidate("Zain", 76, 67, 88),
            new Candidate("Noor", 82, 77, 85)
        };

        // Create Observer
        AdmissionView view = new AdmissionView();

        // Register Observer for Each Candidate
        for (Candidate candidate : candidates) {
            candidate.addObserver(view);
        }

        // Create Filters
        EligibilityFilter eligibilityFilter = new EligibilityFilter();
        TestFilter testFilter = new TestFilter();
        InterviewFilter interviewFilter = new InterviewFilter();

        // Controller
        AdmissionController controller = new AdmissionController();
        for (Candidate candidate : candidates) {
            controller.addCandidate(candidate);
        }

        controller.addFilter(eligibilityFilter);
        controller.addFilter(testFilter);
        controller.addFilter(interviewFilter);

        // Process Admissions
        controller.processAdmissions();
    }
}

