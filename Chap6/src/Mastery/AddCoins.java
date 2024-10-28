package Mastery;

import java.util.Scanner;

public class AddCoins {
	 // Method to calculate the dollar amount from coin counts
    public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters)
    {
        double totalAmount = pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25;
        
        return String.format("Total: $%.2f", totalAmount);
    }
	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for coin quantities
	        System.out.print("Enter your total coins\n");
	        System.out.print("Quarters: ");
	        int quarters = scanner.nextInt();
	        
	        System.out.print("Dimes: ");
	        int dimes = scanner.nextInt();
	        
	        System.out.print("Nickels: ");
	        int nickels = scanner.nextInt();
	        
	        System.out.print("Pennies: ");
	        int pennies = scanner.nextInt();

	        // Display the total dollar amount
	        System.out.println(getDollarAmount(pennies, nickels, dimes, quarters));
	        
	        scanner.close();
	 }
}

/*
Screen Dump
Enter your total coins
Quarters: 10
Dimes: 2
Nickels: 3
Pennies: 1
Total: $2.86
*/