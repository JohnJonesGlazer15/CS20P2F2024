package Mastery;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    
    public static void main(String[] args) {
        // Creates Random and Scanner objects
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        // Determines the secret number between 1 and 20
        int secretNumber = random.nextInt(20) + 1;
        
        // Prompts the player for a number between 1 and 20
        System.out.print("Guess a number between 1 and 20: ");
        int playerGuess = scanner.nextInt();
        
        // Displays the player's guess and the secret number
        System.out.println("You guessed: " + playerGuess);
        System.out.println("The secret number was: " + secretNumber);
        
        // Compares the player's guess to the secret number
        if (playerGuess == secretNumber) {
            System.out.println("You won!");
        } else {
            System.out.println("Better luck next time.");
        }
        
        // Closes the scanner
        scanner.close();
    }
}

/*
Screen Dump
Guess a number between 1 and 20: 14
You guessed: 14
The secret number was: 8
Better luck next time.
*/