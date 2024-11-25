package Mastery;

import java.util.Scanner;

public class MySavings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PiggyBank piggyBank = new PiggyBank();
        int choice;

        do {
            // Display menu
            System.out.println("\n1. Show total in bank.");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel.");
            System.out.println("4. Add a dime.");
            System.out.println("5. Add a quarter.");
            System.out.println("6. Take money out of bank.");
            System.out.println("Enter 0 to quit.");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Handle user input
            switch (choice) {
                case 1:
                    System.out.printf("Total in bank: $%.2f\n", piggyBank.getTotalAmount());
                    break;
                case 2:
                    piggyBank.addPenny();
                    System.out.println("Added a penny.");
                    break;
                case 3:
                    piggyBank.addNickel();
                    System.out.println("Added a nickel.");
                    break;
                case 4:
                    piggyBank.addDime();
                    System.out.println("Added a dime.");
                    break;
                case 5:
                    piggyBank.addQuarter();
                    System.out.println("Added a quarter.");
                    break;
                case 6:
                    double total = piggyBank.takeMoneyOut();
                    System.out.printf("You took $%.2f out of the bank.\n", total);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

/*
Screen Dump
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 1
Total in bank: $0.00

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 5
Added a quarter.

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 1
Total in bank: $0.25

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 6
You took $0.25 out of the bank.

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit.
Enter your choice: 0
Goodbye!
*/
