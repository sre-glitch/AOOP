package fourA;

public class EventManager {
    private EventSession eventSession;

    public void subscribe(Participant participant) {
        System.out.println("Participant " + participant.getName() + " subscribed.");
    }

    public void unsubscribe(Participant participant) {
        System.out.println("Participant " + participant.getName() + " unsubscribed.");
    }

    public void notify(String event) {
        System.out.println("Notifying all participants: " + event);
    }

    public void setEventSession(EventSession session) {
        this.eventSession = session;
    }

    public void startEvent() {
        notify("Event started for session: " + eventSession.getSessionName());
    }

    public void endEvent() {
        notify("Event ended for session: " + eventSession.getSessionName());
    }
}