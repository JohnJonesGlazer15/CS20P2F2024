package Skillbuilders;

import java.util.Scanner;
import java.util.Random;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sqrt = (int) Math.sqrt(number);
        int square = sqrt * sqrt;

        if (square == number) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

        scanner.close();
    }
}