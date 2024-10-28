package Skillbuilders;

import java.util.Scanner;
import java.util.Random;

public class TimeConverter {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Time Converter!");
        System.out.println("Choose a conversion option:");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Days to Hours");
        System.out.println("3. Minutes to Hours");
        System.out.println("4. Hours to Days");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter hours: ");
                double hours = scanner.nextDouble();
                System.out.println(hours + " hours is " + hoursToMinutes(hours) + " minutes.");
                break;
            case 2:
                System.out.print("Enter days: ");
                double days = scanner.nextDouble();
                System.out.println(days + " days is " + daysToHours(days) + " hours.");
                break;
            case 3:
                System.out.print("Enter minutes: ");
                double minutes = scanner.nextDouble();
                System.out.println(minutes + " minutes is " + minutesToHours(minutes) + " hours.");
                break;
            case 4:
                System.out.print("Enter hours: ");
                hours = scanner.nextDouble();
                System.out.println(hours + " hours is " + hoursToDays(hours) + " days.");
                break;
            default:
                System.out.println("Invalid choice. Please run the program again and choose a valid option.");
        }

        scanner.close();
    }

    public static double hoursToMinutes(double hours) {
        return hours * 60;
    }

    public static double daysToHours(double days) {
        return days * 24;
    }

    public static double minutesToHours(double minutes) {
        return minutes / 60;
    }

    public static double hoursToDays(double hours) {
        return hours / 24;
    }
    }