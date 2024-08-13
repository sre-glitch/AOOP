package five4;

public class Machine implements TaskHandler {
    @Override
    public void handleTask() {
        System.out.println("Machine is handling the task.");
    }
}
