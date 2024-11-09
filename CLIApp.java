import java.util.Scanner;

public class CLIApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            showMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Option 1 selected: View items.");
                    // Code to view items
                    break;
                case 2:
                    System.out.println("Option 2 selected: Add item.");
                    // Code to add an item
                    break;
                case 3:
                    System.out.println("Option 3 selected: Update item.");
                    // Code to update an item
                    break;
                case 4:
                    System.out.println("Option 4 selected: Delete item.");
                    // Code to delete an item
                    break;
                case 5:
                    System.out.println("Exiting the application...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); // Blank line for readability
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("===== Main Menu =====");
        System.out.println("1. View Items");
        System.out.println("2. Add Item");
        System.out.println("3. Update Item");
        System.out.println("4. Delete Item");
        System.out.println("5. Exit");
    }
}
