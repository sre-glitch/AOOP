package skill;

interface SubjectInfo {
    String getSubjectID();
    String getSubjectName();
    void registerLearner(Learner learner);
    void displayRegisteredLearners();
}
