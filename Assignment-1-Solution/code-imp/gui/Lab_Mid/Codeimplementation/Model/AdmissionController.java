package Model;

import java.util.ArrayList;
import java.util.List;

import Model.AdmissionFilter;
import Model.Candidate;

public class AdmissionController {
    private final List<Candidate> candidates = new ArrayList<>();
    private final List<AdmissionFilter> filters = new ArrayList<>();

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    public void addFilter(AdmissionFilter filter) {
        filters.add(filter);
    }

    public void processAdmissions() {
        for (Candidate candidate : candidates) {
            System.out.println("Processing Candidate: " + candidate.name);
            for (AdmissionFilter filter : filters) {
                filter.apply(candidate);
            }
            System.out.println(candidate.getDetails() + "\n");
        }
    }
}
