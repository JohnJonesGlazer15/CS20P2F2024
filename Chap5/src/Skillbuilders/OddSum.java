package Skillbuilders;

import java.util.Scanner;
import java.util.Random;

public class OddSum {
    public static void main(String[] args) {
    	        // Create a scanner object to read user input
    	        Scanner input = new Scanner(System.in);
    	        
    	        // Ask the user for a number
    	        System.out.print("Enter a number: ");
    	        int number = input.nextInt();
    	        
    	        int sum = 0;  // Variable to store the sum of odd numbers
    	        
    	        // Loop through numbers from 1 to the entered number
    	        for (int i = 1; i <= number; i++) {
    	            // Check if the number is odd
    	            if (i % 2 != 0) {
    	                sum += i;  // Add the odd number to the sum
    	            }
    	        }
    	        
    	        // Display the sum of odd numbers
    	        System.out.println("Sum of odd numbers from 1 to " + number + " is: " + sum);
    	        
    	        input.close();  // Close the scanner
    	    }

    }