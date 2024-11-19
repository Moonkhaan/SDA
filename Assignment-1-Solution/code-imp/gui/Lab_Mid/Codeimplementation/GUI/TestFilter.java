package GUI;

import Model.Candidate;

public class TestFilter implements AdmissionFilter {
    @Override
    public Candidate apply(Candidate candidate) {
        if (candidate.testScore >= 50) {
            candidate.notifyObservers("Test Filter Passed: Score " + candidate.testScore);
        } else {
            candidate.notifyObservers("Test Filter Failed: Score " + candidate.testScore);
            candidate.status = "Rejected";
        }
        return candidate;
    }
}

