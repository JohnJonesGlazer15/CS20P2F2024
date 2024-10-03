package Mastery;

import java.util.Random;
import java.util.Scanner;

public class MathT 
{
	

    public static void main(String[] args) 
    {
    	 Random random = new Random();
         Scanner scanner = new Scanner(System.in);

         // Generates the two random numbers between 1-10
         int num1 = random.nextInt(10) + 1;
         int num2 = random.nextInt(10) + 1;

         // The array of possible operators
         char[] operators = {'+', '-', '*', '/'};
         // Randomly selects an operator
         char operator = operators[random.nextInt(4)];

         // Initialize the correct answer variable
         double correctAnswer = 0;

         // Calculates the correct answer based on the operator used
         switch (operator) {
             case '+':
                 correctAnswer = num1 + num2;
                 break;
             case '-':
                 correctAnswer = num1 - num2;
                 break;
             case '*':
                 correctAnswer = num1 * num2;
                 break;
             case '/':
                 // Handles division ensuring no division by zero
                 correctAnswer = (double) num1 / num2;
                 correctAnswer = Math.round(correctAnswer * 100.0) / 100.0;  // Round to 2 decimal places
                 break;
         }

         // Prompts the user for an answer
         System.out.println("Solve the following problem: " + num1 + " " + operator + " " + num2);
         double userAnswer = scanner.nextDouble();

         // Check if the user's answer is correct
         if (Math.abs(userAnswer - correctAnswer) < 0.01) {
        	    System.out.println("Correct! Well done.");
        	} else {
        	    System.out.println("Incorrect. The correct answer is: " + correctAnswer);
        	}

         // Closes the scanner
         scanner.close();
    }

}

/* 
Screen Dump
Solve the following problem: 10 * 1
10
Correct! Well done.
*/
