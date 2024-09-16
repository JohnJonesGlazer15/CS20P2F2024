/*
Program: java          Date: 9/13/2024

Purpose: To create an application that analyzes the time taken for a java project as precentages

Author: Malik Muhieddine
School: CHHS
Course: Computer Science 20
*/

package Mastery;

import java.util.Scanner;

public class E11Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the designing time:");
		int t1 = scanner.nextInt();
		
		System.out.print("Please enter the coding time:");
		int t2 = scanner.nextInt();
		
		System.out.print("Please enter the debugging time:");
		int t3 = scanner.nextInt();
		
		System.out.print("Please enter the testing time:");
		int t4 = scanner.nextInt();
		
		int tt = (t1 + t2 + t3 + t4);
		
		float p1 = (float)((t1*100)/tt);
		System.out.println("Designing: "+Math.round(p1)+"%");
		
		float p2 = (float)((t2*100)/tt);
		System.out.println("Coding: "+Math.round(p2)+"%");
		
		float p3 = (float)((t3*100)/tt);
		System.out.println("Debugging: "+Math.round(p3)+"%");
		
		float p4 = (float)((t4*100)/tt);
		System.out.println("testing: "+Math.round(p4)+"%");
		
		
    }
}

/*
Screen Dump

*/