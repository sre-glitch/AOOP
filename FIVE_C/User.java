package fivec;

public class User {
    private String fullName;
    private String id;

    public User(String fullName, String id) {
        this.fullName = fullName;
        this.id = id;
        System.out.println("User created: " + fullName + ", ID: " + id);
    }

    public String getFullName() {
        return fullName;
    }

    public String getId() {
        return id;
    }
}

