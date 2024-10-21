package Mastery;

import java.util.Scanner;

public class GroupAssignment {
    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        // Get first and last name from user
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Determine group assignment based on the first letter of the last name
        char firstLetter = lastName.toUpperCase().charAt(0); // Get the first letter in uppercase
        int group;

        if (firstLetter >= 'A' && firstLetter <= 'I') {
            group = 1;
        } else if (firstLetter >= 'J' && firstLetter <= 'S') {
            group = 2;
        } else {
            group = 3;
        }

        // Output the result
        System.out.println(firstName + " " + lastName + " is assigned to Group " + group);

        scanner.close();
    }
    }
    


/*
Screen Dump
Enter your first name: Malik
Enter your last name: Muhieddine
Malik Muhieddine is assigned to Group 2
*/