package sixtwo;

public class maintwo {
    public static void main(String[] args) {
        ToDoListApplication todoList = new ToDoListApplication();
        
        // Adding tasks
        todoList.addTask("Complete assignment");
        todoList.addTask("Go for a walk");
        todoList.addTask("Read a book");
        
        // Displaying tasks
        todoList.displayTasks();
        
        // Updating a task
        todoList.updateTask(1, "Go for a jog");
        
        // Displaying tasks again
        todoList.displayTasks();
        
        // Removing a task
        todoList.removeTask(0);
        
        // Displaying tasks again
        todoList.displayTasks();
    }
}