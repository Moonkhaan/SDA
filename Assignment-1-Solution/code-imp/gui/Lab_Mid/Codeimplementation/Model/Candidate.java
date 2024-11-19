package Model;

import GUI.Subject;
import DAL.Observer;

import java.util.ArrayList;
import java.util.List;

public class Candidate implements Subject {
    public String name;
    public int grade;
    public int testScore;
    public int interviewScore;
    public String status = "In Process";
    private final List<Observer> observers = new ArrayList<>();

    public Candidate(String name, int grade, int testScore, int interviewScore) {
        this.name = name;
        this.grade = grade;
        this.testScore = testScore;
        this.interviewScore = interviewScore;
    }

    public String getDetails() {
        return "Name: " + name + "\nGrade: " + grade + "\nTest Score: " + testScore + 
               "\nInterview Score: " + interviewScore + "\nStatus: " + status;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
