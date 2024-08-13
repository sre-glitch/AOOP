package five5;

public class SlackService implements AlertService {
    @Override
    public void alert(String message) {
        System.out.println("Slack alert: " + message);
    }
}

