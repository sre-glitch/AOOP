package skill;

public class MainStd {
    public static void main(String[] args) {
      
        Learner learner1 = new Learner("Rishika", "L001");
        Learner learner2 = new Learner("Mounisha", "L002");

        Subject subject1 = new Subject("S101", "Botany");
        Subject subject2 = new Subject("S102", "Zoology");

        RegistrationManager registrationManager = new RegistrationManager();

        EducationSystem educationSystem = new EducationSystem(registrationManager);

        educationSystem.registerLearnerForSubject(learner1, subject1);
        educationSystem.registerLearnerForSubject(learner2, subject2);

        learner1.displayRegisteredSubjects();
        learner2.displayRegisteredSubjects();
        subject1.displayRegisteredLearners();
        subject2.displayRegisteredLearners();}}