package four_b;

public class TraceProcessor extends Processor {
    @Override
    protected boolean canHandle(PriorityLevel priority) {
        return priority == PriorityLevel.TRACE;
    }

    @Override
    protected void logMessage(String logDetails) {
        System.out.println("TRACE: " + logDetails);
    }
}