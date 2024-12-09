/*
Program: Palindrome.java          Last Date of this Revision: December 9th, 2024

Purpose: An application that gets a user to input a string and analyzes it to see if it is a Palindrome or not.

Author: Malik Muhieddine
School: CHHS
Course: Computer Programming 20
*/
package Mastery;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a string to check if it is a palindrome:");
        String input = scanner.nextLine();

        // Check if the input is a palindrome
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and make the string lowercase for uniform comparison
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use two-pointer technique to check for palindrome
        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

/* Screen Dump
Enter a string to check if it is a palindrome:
dog
"dog" is not a palindrome.
 */