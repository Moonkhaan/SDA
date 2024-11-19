package GUI;

import Model.Candidate;

public class EligibilityFilter implements AdmissionFilter {
    @Override
    public Candidate apply(Candidate candidate) {
        if (candidate.grade >= 60) {
            candidate.notifyObservers("Eligibility Filter Passed: Grade " + candidate.grade);
        } else {
            candidate.notifyObservers("Eligibility Filter Failed: Grade " + candidate.grade);
            candidate.status = "Rejected";
        }
        return candidate;
    }
}


