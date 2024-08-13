package five5;

public class AlertManager {
    private AlertService service;

    public AlertManager(AlertService service) {
        this.service = service;
    }

    public void sendAlerts(String message) {
        service.alert(message);
    }

}