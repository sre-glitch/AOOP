package four_b;

public class CriticalProcessor extends Processor {
    @Override
    protected boolean canHandle(PriorityLevel priority) {
        return priority == PriorityLevel.CRITICAL;
    }

    @Override
    protected void logMessage(String logDetails) {
        System.out.println("CRITICAL: " + logDetails);
    }
}

