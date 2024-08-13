package fivec;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<Publication> publications;
    private List<User> users;
    private LendingService lendingService;

    // Constructor
    public LibrarySystem(LendingService lendingService) {
        this.publications = new ArrayList<>();
        this.users = new ArrayList<>();
        this.lendingService = lendingService;
        System.out.println("Library System initialized.");
    }
    // Methods to add publications and users
    public void addPublication(Publication publication) {
        publications.add(publication);
        System.out.println("Publication added: " + publication.getTitle());
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getFullName());
    }

    // Method to give a publication
    public void lendPublication(String identifier, String userId) {
        Publication publication = findPublicationByIdentifier(identifier);
        User user = findUserById(userId);
        if (publication != null && user != null) {
            lendingService.lendPublication(publication, user);
        }
    }
    // Method to return a publication
    public void returnPublication(String identifier, String userId) {
        Publication publication = findPublicationByIdentifier(identifier);
        User user = findUserById(userId);
        if (publication != null && user != null) {
            lendingService.returnPublication(publication, user);
        }
    }

    // Helper methods to find publications and users
    private Publication findPublicationByIdentifier(String identifier) {
        for (Publication publication : publications) {
            if (publication.getIdentifier().equals(identifier)) {
                return publication;
            }
        }
        System.out.println("Publication not found with identifier: " + identifier);
        return null;
    }
    private User findUserById(String userId) {
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        System.out.println("User not found with ID: " + userId);
        return null;
    }
}



