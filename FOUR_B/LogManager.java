package four_b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LogManager {
    private List<Task> taskList = new ArrayList<>();

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void executeTasks() {
        Iterator<Task> iterator = taskList.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            task.run("This is a log message");
        }
    }
}
