package sixfour;

import java.util.Scanner;

public class ExplorerMain {
	public static void main(String[] args) {
        SiteExplorer siteExplorer = new SiteExplorer();
        Scanner input = new Scanner(System.in);
        boolean isOperating = true;

        while (isOperating) {
            System.out.println("\nExplorer Menu:");
            System.out.println("1. Load new page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Show current page");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int action = input.nextInt();
            input.nextLine();

            switch (action) {
                case 1:
                    System.out.print("Enter page URL: ");
                    String url = input.nextLine();
                    siteExplorer.loadPage(url);
                    break;
                case 2:
                    siteExplorer.back();
                    break;
                case 3:
                    siteExplorer.forward();
                    break;
                case 4:
                    siteExplorer.showCurrentPage();
                    break;
                case 5:
                    isOperating = false;
                    break;
                default:
                    System.out.println("Option not recognized.");
            }
        }

        input.close();
        System.out.println("Site Explorer ended.");}}