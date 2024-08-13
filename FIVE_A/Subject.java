package skill;

import java.util.ArrayList;
import java.util.List;

class Subject implements SubjectInfo {
    private String subjectID;
    private String subjectName;
    private List<Learner> registeredLearners;

    public Subject(String subjectID, String subjectName) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.registeredLearners = new ArrayList<>();
    }

    @Override
    public String getSubjectID() {
        return subjectID;
    }

    @Override
    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public void registerLearner(Learner learner) {
        registeredLearners.add(learner);
        System.out.println(learner.getLearnerName() + " registered for " + subjectName);
    }

    @Override
    public void displayRegisteredLearners() {
        System.out.println("Learners registered for " + subjectName + ":");
        for (Learner learner : registeredLearners) {
            System.out.println("- " + learner.getLearnerName());
        }
    }
}
