package Skillbuilders;

import java.util.Scanner;
import java.util.Random;

public class NumbersSum {
    public static void main(String[] args) {
    	 // Create a scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int sum = 0;  // Variable to store the sum
        
        // Loop through numbers 1 to the entered number
        for (int i = 1; i <= number; i++) {
            System.out.println(i);  // Print the current number
            sum += i;  // Add the current number to the sum
        }
        
        // Display the total sum
        System.out.println("Sum of numbers: " + sum);
        
        input.close();  // Close the scanner
    }
    }