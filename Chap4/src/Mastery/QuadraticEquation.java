package Mastery;

import java.util.Random;
import java.util.Scanner;

public class QuadraticEquation {
    
	 public static void main(String[] args) {

	        // Creates a Scanner object to read input from the user
	        Scanner input = new Scanner(System.in);

	        // Prompts the user to input values for a, b, and c
	        System.out.print("Input a: ");
	        double a = input.nextDouble();
	        System.out.print("Input b: ");
	        double b = input.nextDouble();
	        System.out.print("Input c: ");
	        double c = input.nextDouble();
	        
	        // Calculates the discriminant (b^2 - 4ac)
	        double result = b * b - 4.0 * a * c;

	        // If discriminant is positive, there are two real roots
	        if (result > 0.0) {
	        	// Calculate the two real roots using the quadratic formula
	        	double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
             double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
             // Outputs the two real roots
             System.out.println("The roots are " + r1 + " and " + r2);
         } 
	        // If discriminant is zero, there's only one real root
	        else if (result == 0.0) {
             double r1 = -b / (2.0 * a); // Single real root
             System.out.println("The root is " + r1);
         } 
	        // If discriminant is negative, no real roots exist
	        else {
             System.out.println("The equation has no real roots.");
         }

	        input.close();
	      }
}

/*
Screen Dump
Input a: 9
Input b: 10
Input c: 2
The roots are -0.2615831876594899 and -0.8495279234516212
*/