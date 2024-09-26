package Skillbuilders;

import java.util.Scanner;

public class GradeAvg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter your first grade:");
		int g1 = scanner.nextInt();
		
		System.out.print("Please enter your second grade:");
		int g2 = scanner.nextInt();
		
		System.out.print("Please enter your third grade:");
		int g3 = scanner.nextInt();
		
		System.out.print("Please enter your fourth grade:");
		int g4 = scanner.nextInt();
		
		System.out.print("Please enter your fifth grade:");
		int g5 = scanner.nextInt();
		
		int avg = (g1 + g2 + g3 + g4 + g5)/5;
		System.out.print("Your grade average is:"+ Math.round(avg));
    }
}
