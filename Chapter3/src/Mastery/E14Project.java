/*
Program: java          Date: 9/19/2024

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
		double A = (double)((totalA*100)/total);
		double M = (double)((totalM*100)/total);
		System.out.println("Candidate-----Votes--Percentage");
		System.out.println("Awbrey-------"+totalA+"------"+A+"%");
		System.out.println("Martinez-----"+totalM+"------"+M+"%");
		System.out.println("Total Votes:"+total);
    }
}

/*
Screen Dump
Please enter Awbrey's election results for New York:314159
Please enter Martinez's election results for New York:271860
Please enter Awbrey's election results for New Jersey:89008
Please enter Martinez's election results for New Jersey:121032
Please enter Awbrey's election results for Connecticut:213451
Please enter Martinez's election results for Connecticut:231034
Candidate-----Votes--Percentage
Awbrey-------616618------49.0%
Martinez-----623926------50.0%
Total Votes:1240544
<<<<<<< HEAD
*/
=======
*/
>>>>>>> branch 'master' of https://github.com/JohnJonesGlazer15/CS20P2F2024.git
