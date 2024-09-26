package Skillbuilders;

import java.util.Scanner;

public class GradeAvg2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        
        int numberOfGrades = 5; 
       
        for (int i = 1; i <= numberOfGrades; i++) {
            System.out.print("Please enter grade " + i + ":");
            int grade = scanner.nextInt();
            sum += grade;
        }
       
        double avg = sum / (double) numberOfGrades;
        
        long roundedAvg = Math.round(avg);
        
        System.out.print("Your grade average is: " + roundedAvg + "%");
    }
}