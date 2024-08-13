package fivec;

public class Publication {
    private String title;
    private String writer;
    private String identifier;
    private boolean available;

    // Constructor
    public Publication(String title, String writer, String identifier) {
        this.title = title;
        this.writer = writer;
        this.identifier = identifier;
        this.available = true;
        System.out.println("Publication created: " + title + " by " + writer);
    }
    
    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getIdentifier() {
        return identifier;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        System.out.println("Publication availability updated: " + title + " is now " + (available ? "available" : "not available"));
    }
}

