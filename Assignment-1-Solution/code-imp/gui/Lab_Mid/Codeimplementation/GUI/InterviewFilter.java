package GUI;

import Model.Candidate;

public class InterviewFilter implements AdmissionFilter {
    @Override
    public Candidate apply(Candidate candidate) {
        if (candidate.interviewScore >= 70) {
            candidate.notifyObservers("Interview Filter Passed: Score " + candidate.interviewScore);
            candidate.status = "Accepted";
        } else {
            candidate.notifyObservers("Interview Filter Failed: Score " + candidate.interviewScore);
            candidate.status = "Rejected";
        }
        return candidate;
    }
}
