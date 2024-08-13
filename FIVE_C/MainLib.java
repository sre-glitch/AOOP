package fivec;

public class MainLib {
    public static void main(String[] args) {
        LendingService lendingService = new LendingService();
        LibrarySystem librarySystem = new LibrarySystem(lendingService);

        // Adding publications and users
        Publication publication1 = new Publication("The Myth Of Sisyphus", "Albert Camus", "111111111");
        Publication publication2 = new Publication("The Metamorphosis", "Franz Kafka", "222222222");

        User user1 = new User("Gopi", "U001");
        User user2 = new User("Ramesh", "U002");

        librarySystem.addPublication(publication1);
        librarySystem.addPublication(publication2);
        librarySystem.addUser(user1);
        librarySystem.addUser(user2);

        // Lending and returning publications
        librarySystem.lendPublication("111111111", "U001");
        librarySystem.returnPublication("111111111", "U001");}}