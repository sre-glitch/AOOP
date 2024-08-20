package sixone;
import java.util.ArrayList;

public class TaskManagementSystem {
	private ArrayList<Task> tasks;
	public TaskManagementSystem() {
		 this.tasks = new ArrayList<>();
	        System.out.println("Task Management System initialized.");
    }

    public void addTask(Task task) {
    	 tasks.add(task);
         System.out.println("Task added: \"" + task.getDescription() + "\"");
    }

    public void updateTask(int index, String newDescription) {
    	 if (index >= 0 && index < tasks.size()) {
             Task task = tasks.get(index);
             System.out.println("Updating task at position " + index + ": \"" + task.getDescription() + "\" to \"" + newDescription + "\"");
             task.setDescription(newDescription); 
         } else {
             System.out.println("Invalid index. No task updated.");
         }
    }

    public void removeTask(int index) {
    	 if (index >= 0 && index < tasks.size()) {
             Task removedTask = tasks.remove(index);
             System.out.println("Task removed: \"" + removedTask.getDescription() + "\"");
         } else {
             System.out.println("Invalid index. No task removed.");
         }
    }

    public void displayTasks() {
    	if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("Displaying all tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": \"" + tasks.get(i).getDescription() + "\"");
            }
        }
    }
}
