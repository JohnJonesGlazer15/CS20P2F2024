package Skillbuilders;

import java.util.Scanner;

public class StudentRoster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students in the class: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        String[] students = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
        }

        System.out.println("\nStudent Roster:");
        for (String student : students) {
            System.out.println(student);
        }
        scanner.close();
    }
}
