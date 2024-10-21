package Mastery;

import java.util.Random;
import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
    	// Create a scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check if the number is prime
        boolean isPrime = true;  // Assume the number is prime initially
        
        // 1 is not a prime number, so handle it separately
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop to check if the number is divisible by any number other than 1 and itself
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {  // If the number is divisible by i, it's not prime
                    isPrime = false;
                    break;
                }
            }
        }
        
        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();  // Close the scanner
    }
}


/*
Screen Dump
Enter the first number: 10
Enter the second number: 20
Prime numbers between 10 and 20 are:
11
13
17
19
*/