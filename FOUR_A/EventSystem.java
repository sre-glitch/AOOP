package fourA;

public class EventSystem {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        EventSession session = new EventSession(1, "Tech Conference", 100.0f);
        eventManager.setEventSession(session);

        Participant participant1 = new Participant(301, "Sreya", "eve@example.com");
        Participant participant2 = new Participant(302, "Joshitha", "alice@example.com");

        eventManager.subscribe(participant1);
        eventManager.subscribe(participant2);

        eventManager.startEvent();
        eventManager.endEvent();

        eventManager.unsubscribe(participant1);
    }
}
