/*
Program: java          Date: 9/13/2024

Purpose: To find the ones, tens, and hundreds place of a given number

Author: Malik Muhieddine
School: CHHS
Course: Computer Science 20
*/

package Mastery;

import java.util.Scanner;

public class DigitsM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your number: ");
        
        int number = scanner.nextInt();

        int ones = (number/1)%10;

        int tens = (number/10)%10;
        
        int hund = (number/100)%10;

        System.out.println("The Ones place digit is: " + ones);
        System.out.println("The Tens place digit is: " + tens);
        System.out.println("The Hundreds place digit is: " + hund);
    }
}

/*
Screen Dump
Please enter your number: 151
The Ones place digit is: 1
The Tens place digit is: 5
TheHundreds place digit is: 1
*/