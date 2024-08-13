package five1;

public class WorkerInfo {
    private String workerName;
    private String jobTitle;

    public WorkerInfo(String workerName, String jobTitle) {
        this.workerName = workerName;
        this.jobTitle = jobTitle;
        System.out.println("Worker info: " + workerName + ", Job Title: " + jobTitle);
    }

    public String getJobTitle() {
        System.out.println("Retrieving job title for worker: " + workerName);
        return jobTitle;}}