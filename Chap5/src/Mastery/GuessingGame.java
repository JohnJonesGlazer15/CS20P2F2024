package Mastery;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
    	        Scanner scanner = new Scanner(System.in);
    	        int secretNumber = 15; // You can set this to any number between 1 and 20 or randomize it if needed
    	        int guess;

    	        System.out.println("Guess a number between 1 and 20:");
    	        
    	        do {
    	            System.out.print("Enter your guess: ");
    	            guess = scanner.nextInt();
    	            
    	            if (guess < secretNumber) {
    	                System.out.println("Try again. Your guess is too low.");
    	            } else if (guess > secretNumber) {
    	                System.out.println("Try again. Your guess is too high.");
    	            } else {
    	                System.out.println("You won!");
    	            }
    	        } while (guess != secretNumber);
    	        
    	        scanner.close();
    	    }
    }
/* 
Screen Dump
Guess a number between 1 and 20:
Enter your guess: 10
Try again. Your guess is too low.
Enter your guess: 15
You won!
*/
