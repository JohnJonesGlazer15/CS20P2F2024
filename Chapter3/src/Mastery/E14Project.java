/*
Program: java          Date: 9/18/2024

Purpose: To create an application that asks the user for election results and then displays who well each candidate did in three states

Author: Malik Muhieddine
School: CHHS
Course: Computer Science 20
*/

package Mastery;

import java.util.Scanner;

public class E14Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Awbrey's election results for New York:");
		int A1 = scanner.nextInt();
		System.out.print("Please enter Martinez's election results for New York:");
		int M1 = scanner.nextInt();
		System.out.print("Please enter Awbrey's election results for New Jersey:");
		int A2 = scanner.nextInt();
		System.out.print("Please enter Martinez's election results for New Jersey:");
		int M2 = scanner.nextInt();
		System.out.print("Please enter Awbrey's election results for Connecticut:");
		int A3 = scanner.nextInt();
		System.out.print("Please enter Martinez's election results for Connecticut:");
		int M3 = scanner.nextInt();
		int total = (A1 + A2 + A3 + M1 + M2 + M3);
		int totalA = (A1 + A2 + A3);
		int totalM = (M1 + M2 + M3);
		float A = (float)((totalA*100)/total);
		float M = (float)((totalM*100)/total);
		System.out.println("Candidate-----Votes--Percentage");
		System.out.println("Awbrey-------"+totalA+"------"+Math.round(A)+"%");
		System.out.println("Martinez-----"+totalM+"------"+Math.round(M)+"%");
		System.out.println("Total Votes:"+total);
    }
}

/*
Screen Dump

*/