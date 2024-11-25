package Mastery;

import java.util.Scanner;

public class LunchOrder {
    public static void main(String[] args) {
        // Food items based on the provided chart
        Food hamburger = new Food(1.85, 9, 33, 1);
        Food salad = new Food(2.00, 1, 11, 5);
        Food fries = new Food(1.30, 11, 36, 4);
        Food soda = new Food(0.95, 0, 38, 0);

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Variables to track totals
        double totalPrice = 0.0;
        double totalFat = 0.0, totalCarbs = 0.0, totalFiber = 0.0;

        // Main loop to allow repeated interactions
        boolean keepOrdering = true;
        while (keepOrdering) {
            System.out.println("\nMenu:");
            System.out.println("1. Hamburger");
            System.out.println("2. Salad");
            System.out.println("3. Fries");
            System.out.println("4. Soda");
            System.out.println("5. Quit and Checkout");

            // Get the user's choice
            int choice = getValidInput(scanner, "Choose an item (1-5): ");

            switch (choice) {
                case 1: // Hamburger
                    int hamburgerCount = getValidInput(scanner, "Enter number of hamburgers: ");
                    totalPrice += hamburgerCount * hamburger.getPrice();
                    totalFat += hamburgerCount * hamburger.getFat();
                    totalCarbs += hamburgerCount * hamburger.getCarbs();
                    totalFiber += hamburgerCount * hamburger.getFiber();
                    break;

                case 2: // Salad
                    int saladCount = getValidInput(scanner, "Enter number of salads: ");
                    totalPrice += saladCount * salad.getPrice();
                    totalFat += saladCount * salad.getFat();
                    totalCarbs += saladCount * salad.getCarbs();
                    totalFiber += saladCount * salad.getFiber();
                    break;

                case 3: // Fries
                    int friesCount = getValidInput(scanner, "Enter number of fries: ");
                    totalPrice += friesCount * fries.getPrice();
                    totalFat += friesCount * fries.getFat();
                    totalCarbs += friesCount * fries.getCarbs();
                    totalFiber += friesCount * fries.getFiber();
                    break;

                case 4: // Soda
                    int sodaCount = getValidInput(scanner, "Enter number of sodas: ");
                    totalPrice += sodaCount * soda.getPrice();
                    totalFat += sodaCount * soda.getFat();
                    totalCarbs += sodaCount * soda.getCarbs();
                    totalFiber += sodaCount * soda.getFiber();
                    break;

                case 5: // Quit
                    keepOrdering = false;
                    break;

                default:
                    System.out.println("Error: Invalid choice. Please choose a number between 1 and 5.");
            }
        }

        // Display the total order summary
        System.out.println("\nYour order contains:");
        System.out.printf("%.1fg of fat, %.1fg of carbs, and %.1fg of fiber.\n", totalFat, totalCarbs, totalFiber);
        System.out.printf("Total price: $%.2f\n", totalPrice);

        // Close scanner
        scanner.close();
    }

    /**
     * Helper method to validate input
     * Ensures the input is a non-negative integer.
     *
     * @param scanner the Scanner object to read input
     * @param prompt  the message to display to the user
     * @return a valid non-negative integer
     */
    private static int getValidInput(Scanner scanner, String prompt) {
        int value = -1;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= 0) {
                    break; // valid input, exit the loop
                } else {
                    System.out.println("Error: Please enter a non-negative number.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.next(); // consume the invalid input
            }
        }
        return value;
    }
}


/*
Screen Dump
Menu:
1. Hamburger
2. Salad
3. Fries
4. Soda
5. Quit and Checkout
Choose an item (1-5): 1
Enter number of hamburgers: 1

Menu:
1. Hamburger
2. Salad
3. Fries
4. Soda
5. Quit and Checkout
Choose an item (1-5): 2
Enter number of salads: 3

Menu:
1. Hamburger
2. Salad
3. Fries
4. Soda
5. Quit and Checkout
Choose an item (1-5): 3
Enter number of fries: 3

Menu:
1. Hamburger
2. Salad
3. Fries
4. Soda
5. Quit and Checkout
Choose an item (1-5): 4
Enter number of sodas: 4

Menu:
1. Hamburger
2. Salad
3. Fries
4. Soda
5. Quit and Checkout
Choose an item (1-5): 5

Your order contains:
45.0g of fat, 326.0g of carbs, and 28.0g of fiber.
Total price: $15.55
*/
