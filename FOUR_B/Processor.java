package four_b;

public abstract class Processor {
    protected Processor nextProcessor;

    public void setNextProcessor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void handle(PriorityLevel priority, String logDetails) {
        if (canHandle(priority)) {
            logMessage(logDetails);
        } else if (nextProcessor != null) {
            nextProcessor.handle(priority, logDetails);
        } else {
            System.out.println("No processor found for priority: " + priority);
        }
    }

    protected abstract boolean canHandle(PriorityLevel priority);

    protected abstract void logMessage(String logDetails);
}