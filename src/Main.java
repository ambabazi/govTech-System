import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n=== DIGITAL GOVERNMENT SYSTEM ===");
            System.out.println("1. Register Citizen");
            System.out.println("2. Apply for Service");
            System.out.println("3. Process Applications");
            System.out.println("4. View Applications");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Citizen registered.");
                    break;

                case 2:
                    System.out.println("Application submitted.");
                    break;

                case 3:
                    System.out.println("Applications processed.");
                    break;

                case 4:
                    System.out.println("Displaying applications...");
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 5);
    }
}
