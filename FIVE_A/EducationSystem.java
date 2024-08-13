package skill;

public class EducationSystem {
    private RegistrationManager registrationManager;

    public EducationSystem(RegistrationManager registrationManager) {
        this.registrationManager = registrationManager;
    }

    public void registerLearnerForSubject(LearnerInfo learner, SubjectInfo subject) {
        registrationManager.register(learner, subject);
    }
}
