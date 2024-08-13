package four_b;

public class SystemClient {
    public static void main(String[] args) {

        Processor noticeProcessor = new NoticeProcessor();
        Processor traceProcessor = new TraceProcessor();
        Processor criticalProcessor = new CriticalProcessor();

        noticeProcessor.setNextProcessor(traceProcessor);
        traceProcessor.setNextProcessor(criticalProcessor);

        LogManager logManager = new LogManager();
        logManager.addTask(new LogTask(noticeProcessor, PriorityLevel.NOTICE));
        logManager.addTask(new LogTask(traceProcessor, PriorityLevel.TRACE));
        logManager.addTask(new LogTask(criticalProcessor, PriorityLevel.CRITICAL));

        logManager.executeTasks();}}