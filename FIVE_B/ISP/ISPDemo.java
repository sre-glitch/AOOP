package five4;

public class ISPDemo {
    public static void main(String[] args) {
        TaskHandler machine = new Machine();
        machine.handleTask();

        Individual individual = new Individual();
        individual.handleTask();
        individual.takeMeal();}}