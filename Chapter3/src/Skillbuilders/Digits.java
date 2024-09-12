package Skillbuilders;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a two-digit number: ");
        int number = scanner.nextInt();

        int tens = number / 10;

        int ones = number % 10;

        System.out.println("Tens place digit: " + tens);
        System.out.println("Ones place digit: " + ones);
    }
}
