package Mastery;

import java.util.Random;
import java.util.Scanner;

public class MetricConversion 
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user for the value to convert
        System.out.print("Enter a number to convert: ");
        double value = scanner.nextDouble();

        // Display conversion options
        System.out.println("Choose a conversion:");
        System.out.println("1. Inches to Centimeters");
        System.out.println("2. Feet to Centimeters");
        System.out.println("3. Yards to Meters");
        System.out.println("4. Miles to Kilometers");
        System.out.println("5. Centimeters to Inches");
        System.out.println("6. Centimeters to Feet");
        System.out.println("7. Meters to Yards");
        System.out.println("8. Kilometers to Miles");

        // Prompt user to choose a conversion option
        System.out.print("Enter your choice (1-8): ");
        int choice = scanner.nextInt();

        // Perform the selected conversion
        double result = performConversion(choice, value);

        // Display the result if a valid choice was made
        if (result != -1) {
            System.out.println("Converted value: " + result);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    // Method to perform the conversion based on the user's choice
    public static double performConversion(int choice, double value) {
        return switch (choice) {
            case 1 -> value * 2.54;           // Inches to Centimeters
            case 2 -> value * 30;             // Feet to Centimeters
            case 3 -> value * 0.91;           // Yards to Meters
            case 4 -> value * 1.6;            // Miles to Kilometers
            case 5 -> value / 2.54;           // Centimeters to Inches
            case 6 -> value / 30;             // Centimeters to Feet
            case 7 -> value / 0.91;           // Meters to Yards
            case 8 -> value / 1.6;            // Kilometers to Miles
            default -> -1;                    // Invalid choice returns -1
        };
    }

    }

/*
Screen Dump
Enter a number to convert: 10
Choose a conversion:
1. Inches to Centimeters
2. Feet to Centimeters
3. Yards to Meters
4. Miles to Kilometers
5. Centimeters to Inches
6. Centimeters to Feet
7. Meters to Yards
8. Kilometers to Miles
Enter your choice (1-8): 2
Converted value: 300.0
*/
