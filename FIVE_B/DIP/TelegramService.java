package five5;

public class TelegramService implements AlertService {
    @Override
    public void alert(String message) {
        System.out.println("Telegram alert: " + message);
    }
}

