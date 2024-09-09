package sixfive;

import java.util.Scanner;

public class CollectionMain {
    public static void main(String[] args) {
        MusicCollection collection = new MusicCollection();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nMusic Collection Menu:");
            System.out.println("1. Add Track");
            System.out.println("2. Remove Track");
            System.out.println("3. Move Track");
            System.out.println("4. Show Collection");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter track title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter performer name: ");
                    String performer = scanner.nextLine();
                    collection.addTrack(title, performer);
                    break;
                case 2:
                    System.out.print("Enter track title to remove: ");
                    String trackToRemove = scanner.nextLine();
                    collection.removeTrack(trackToRemove);
                    break;
                case 3:
                    System.out.print("Enter the current position of the track: ");
                    int currentPos = scanner.nextInt();
                    System.out.print("Enter the new position of the track: ");
                    int newPos = scanner.nextInt();
                    collection.relocateTrack(currentPos, newPos);
                    break;
                case 4:
                    collection.showTracks();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
        System.out.println("Music Collection closed.");}}