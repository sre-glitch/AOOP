package skill;

interface LearnerInfo {
    String getLearnerName();
    String getLearnerID();
    void registerForSubject(Subject subject);
    void displayRegisteredSubjects();
}
