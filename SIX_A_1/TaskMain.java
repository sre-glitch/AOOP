package sixone;

public class TaskMain {
    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();
    
    tms.addTask(new Task("Finish project"));
    tms.addTask(new Task("Attend meeting"));
    tms.addTask(new Task("Buy groceries"));
    
    tms.displayTasks();
    
    tms.updateTask(1, "Attend important meeting");
    
    tms.displayTasks();
    
    tms.removeTask(0);
    
    tms.displayTasks();
}
}