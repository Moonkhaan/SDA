package Model;

import Model.Candidate;

public interface AdmissionFilter {
    Candidate apply(Candidate candidate);
}
