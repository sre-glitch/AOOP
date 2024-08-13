package four_b;

public class LogTask implements Task {
    private Processor processor;
    private PriorityLevel priority;

    public LogTask(Processor processor, PriorityLevel priority) {
        this.processor = processor;
        this.priority = priority;
    }

    @Override
    public void run(String logDetails) {
        System.out.println("Running log task for priority: " + priority);
        processor.handle(priority, logDetails);
    }
}