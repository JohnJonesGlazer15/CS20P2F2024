package Mastery;

import java.util.Scanner;

public class GradeBook {
    private int[][] grades; // 2D array to store grades for 12 students and 5 tests

    // Constructor to initialize the grades array
    public GradeBook(int students, int tests) {
        grades = new int[students][tests];
    }

    // Method to get grades from the user
    public void getGrades() {
        Scanner scanner = new Scanner(System.in);

        for (int student = 0; student < grades.length; student++) {
            System.out.println("Enter grades for Student " + (student + 1) + ":");
            for (int test = 0; test < grades[student].length; test++) {
                System.out.print("Test " + (test + 1) + ": ");
                grades[student][test] = scanner.nextInt();
            }
        }
    }

    // Method to display all grades
    public void showGrades() {
        System.out.println("\nClass Grades:");
        System.out.println("Student\\Test\tTest 1\tTest 2\tTest 3\tTest 4\tTest 5");
        for (int student = 0; student < grades.length; student++) {
            System.out.print("Student " + (student + 1) + ":\t");
            for (int test = 0; test < grades[student].length; test++) {
                System.out.print(grades[student][test] + "\t");
            }
            System.out.println();
        }
    }

    // Method to calculate the average grade for a specific student
    public double studentAvg(int studentNumber) {
        if (studentNumber < 1 || studentNumber > grades.length) {
            throw new IllegalArgumentException("Invalid student number.");
        }

        int studentIndex = studentNumber - 1;
        int total = 0;

        for (int score : grades[studentIndex]) {
            total += score;
        }

        return (double) total / grades[studentIndex].length;
    }

    // Method to calculate the average grade for a specific test
    public double testAvg(int testNumber) {
        if (testNumber < 1 || testNumber > grades[0].length) {
            throw new IllegalArgumentException("Invalid test number.");
        }

        int testIndex = testNumber - 1;
        int total = 0;

        for (int[] student : grades) {
            total += student[testIndex];
        }
        return (double) total / grades.length;
    }
}
