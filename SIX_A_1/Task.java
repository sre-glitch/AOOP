package sixone;

public class Task {
	private String description;

    public Task(String description) {
        this.description = description; 
        System.out.println("New task created: \"" + description + "\"");
    }
    public String getDescription() {
        return description;
  }
  
    public void setDescription(String description) {
        this.description = description;
        System.out.println("Task description updated to: \"" + description + "\"");
  }
}