package fourA;

public class Participant {
    private String name;

    public Participant(int participantID, String name, String email) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String event) {
        System.out.println("Notification for " + name + ": " + event);
    }
}