package sixtwo;

import java.util.ArrayList;
import java.util.List;

public class ToDoListApplication {
	private List<String> tasks;

    public ToDoListApplication() {
        this.tasks = new ArrayList<>();  // Initialize the task list using ArrayList
        System.out.println("To-Do List Application initialized.");
    }

    public void addTask(String task) {
        tasks.add(task);  // Add a task to the list
        System.out.println("Task added: \"" + task + "\"");
    }

    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            String oldTask = tasks.get(index);
            tasks.set(index, newDescription);  // Update the task's description
            System.out.println("Task updated at index " + index + ": \"" + oldTask + "\" to \"" + newDescription + "\"");
        } else {
            System.out.println("Invalid index. No task updated.");
        }
    }
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            String removedTask = tasks.remove(index);  // Remove the task by its index
            System.out.println("Task removed: \"" + removedTask + "\"");
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
                System.out.println(i + ": \"" + tasks.get(i) + "\"");
            }
        }
    }
}
