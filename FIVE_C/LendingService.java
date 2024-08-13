package fivec;

public class LendingService implements Lending {

    @Override
    public void lendPublication(Publication publication, User user) {
        if (publication.isAvailable()) {
            publication.setAvailable(false);
            System.out.println(user.getFullName() + " borrowed " + publication.getTitle());
        } else {
            System.out.println(publication.getTitle() + " is not available for lending.");
        }
    }

    @Override
    public void returnPublication(Publication publication, User user) {
        publication.setAvailable(true);
        System.out.println(user.getFullName() + " returned " + publication.getTitle());
    }
}
