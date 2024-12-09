/*
Program: EvensAndOdds.java          Last Date of this Revision: December 9th, 2024

Purpose: An application that randomly generates a set of numbers and sorts them as either even or odd

Author: Malik Muhieddine
School: CHHS
Course: Computer Programming 20
*/

package Mastery;

import java.util.Random;

public class EvensAndOdds {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[25];
        StringBuilder evens = new StringBuilder("EVEN: ");
        StringBuilder odds = new StringBuilder("ODD: ");

        // Generate 25 random numbers and categorize them
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Generate a number between 0 and 99
            if (numbers[i] % 2 == 0) {
                evens.append(numbers[i]).append(" ");
            } else {
                odds.append(numbers[i]).append(" ");
            }
        }

        // Display the results
        System.out.println(evens);
        System.out.println(odds);
    }
}

/* Screen Dump

EVEN: 70 60 30 44 16 16 68 10 70 36 78 4 20 
ODD: 17 53 71 23 43 51 63 31 17 15 93 57 
 
 */