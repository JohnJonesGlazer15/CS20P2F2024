package Skillbuilders;

import java.util.Scanner;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the minimum value: ");
        int min = scanner.nextInt();

        System.out.print("Enter the maximum value: ");
        int max = scanner.nextInt();

        if (min > max) {
            System.out.println("Error: Minimum value cannot be greater than the maximum value.");
        } else {
            Random random = new Random();

            int randomNumber = random.nextInt((max - min) + 1) + min;

            System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
        }

        scanner.close();
    }
}
