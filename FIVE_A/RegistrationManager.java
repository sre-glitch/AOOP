package skill;

class RegistrationManager {
    public void register(LearnerInfo learner, SubjectInfo subject) {
        learner.registerForSubject((Subject) subject);
        subject.registerLearner((Learner) learner);
    }
}
