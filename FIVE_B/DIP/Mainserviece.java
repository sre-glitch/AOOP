package five5;

public class Mainserviece {
	public static void main(String[] args) {
        AlertService slackService = new SlackService();
        AlertManager manager = new AlertManager(slackService);
        manager.sendAlerts("Meeting reminder via Slack");

        AlertService telegramService = new TelegramService();
        manager = new AlertManager(telegramService);
        manager.sendAlerts("Meeting reminder via Telegram");}}
