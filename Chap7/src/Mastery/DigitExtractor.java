package Mastery;

import java.util.Scanner;

public class DigitExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();

        // Create Num object
        Num num = new Num(inputNumber);

        // Menu loop
        char choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("Show (W)hole number.");
            System.out.println("Show (O)nes place number.");
            System.out.println("Show (T)ens place number.");
            System.out.println("Show (H)undreds place number.");
            System.out.println("(Q)uit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().toLowerCase().charAt(0);

            switch (choice) {
                case 'w':
                    System.out.println("The whole number is: " + num.getWholeNumber());
                    break;
                case 'o':
                    System.out.println("The ones place digit is: " + num.getOnesDigit());
                    break;
                case 't':
                    System.out.println("The tens place digit is: " + num.getTensDigit());
                    break;
                case 'h':
                    System.out.println("The hundreds place digit is: " + num.getHundredsDigit());
                    break;
                case 'q':
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 'q');

        scanner.close();
    }
}
/*
Screen Dump
Enter an integer: 123

Menu:
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: w
The whole number is: 123

Menu:
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: o
The ones place digit is: 3

Menu:
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: t
The tens place digit is: 2

Menu:
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: h
The hundreds place digit is: 1

Menu:
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: q
Exiting the program. Goodbye!

*/
