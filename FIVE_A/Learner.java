package skill;

import java.util.ArrayList;
import java.util.List;

class Learner implements LearnerInfo {
    private String learnerName;
    private String learnerID;
    private List<Subject> registeredSubjects;

    public Learner(String learnerName, String learnerID) {
        this.learnerName = learnerName;
        this.learnerID = learnerID;
        this.registeredSubjects = new ArrayList<>();
    }

    @Override
    public String getLearnerName() {
        return learnerName;
    }

    @Override
    public String getLearnerID() {
        return learnerID;
    }

    @Override
    public void registerForSubject(Subject subject) {
        registeredSubjects.add(subject);
        System.out.println(learnerName + " registered for " + subject.getSubjectName());
    }

    @Override
    public void displayRegisteredSubjects() {
        System.out.println(learnerName + " is registered for:");
        for (Subject subject : registeredSubjects) {
            System.out.println("- " + subject.getSubjectName());
        }
    }
}
