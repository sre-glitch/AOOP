package four_b;

public class NoticeProcessor extends Processor {
    @Override
    protected boolean canHandle(PriorityLevel priority) {
        return priority == PriorityLevel.NOTICE;
    }

    @Override
    protected void logMessage(String logDetails) {
        System.out.println("NOTICE: " + logDetails);
        }}