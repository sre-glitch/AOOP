package fourA;

public class EventSession {
    private String sessionName;

    public EventSession(int sessionID, String sessionName, float entryFee) {
        this.sessionName = sessionName;
    }

    public String getSessionName() {
        return sessionName;
    }
}