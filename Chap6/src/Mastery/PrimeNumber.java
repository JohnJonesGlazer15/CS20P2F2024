package Mastery;

import java.util.Scanner;

public class PrimeNumber {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Use the isPrime() method to check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();  // Close the scanner
    }
}

/*
Screen Dump
Enter a number: 17
17 is a prime numbe
*/