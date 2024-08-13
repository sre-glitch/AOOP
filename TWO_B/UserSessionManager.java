package two_b;

public class UserSessionManager {
    private static UserSessionManager instance;
    private String activeUser;

    private UserSessionManager() {}

    public static UserSessionManager getInstance() {
        if (instance == null) {
            instance = new UserSessionManager();
        }
        return instance;
    }

    public void startSession(String username, String password) {
        activeUser = username;
        System.out.println("Session started for user: " + username);
    }

    public String getActiveUser() {
        System.out.println("Active user: " + activeUser);
        return activeUser;
    }
}
