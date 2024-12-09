/*
Program: CourseGrades.java          Last Date of this Revision: December 9th, 2024

Purpose: An application that gets a user to input the five test scores for 12 students and returns the grade average for that student and the average for the test.

Author: Malik Muhieddine
School: CHHS
Course: Computer Programming 20
*/
package Mastery;

public class CourseGrades {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook(12, 5);

        // Get grades from the user
        gradeBook.getGrades();

        // Display all grades
        gradeBook.showGrades();

        // Get and display the average grade for a specific student
        System.out.println("\nAverage grade for Student 3: " + gradeBook.studentAvg(3));

        // Get and display the average grade for a specific test
        System.out.println("Average grade for Test 2: " + gradeBook.testAvg(2));
    }
}
/* Screen Dump
Enter grades for Student 1:
Test 1: 55
Test 2: 66
Test 3: 77
Test 4: 88
Test 5: 99
Enter grades for Student 2:
Test 1: 55
Test 2: 66
Test 3: 77
Test 4: 88
Test 5: 99
Enter grades for Student 3:
Test 1: 99
Test 2: 88
Test 3: 77
Test 4: 66
Test 5: 55
Enter grades for Student 4:
Test 1: 11
Test 2: 22
Test 3: 33
Test 4: 44
Test 5: 55
Enter grades for Student 5:
Test 1: 22
Test 2: 11
Test 3: 33
Test 4: 44
Test 5: 66
Enter grades for Student 6:
Test 1: 33
Test 2: 44
Test 3: 22
Test 4: 45
Test 5: 66
Enter grades for Student 7:
Test 1: 44
Test 2: 55
Test 3: 33
Test 4: 44
Test 5: 22
Enter grades for Student 8:
Test 1: 33
Test 2: 44
Test 3: 55
Test 4: 66
Test 5: 77
Enter grades for Student 9:
Test 1: 11
Test 2: 33
Test 3: 55
Test 4: 66
Test 5: 8
Enter grades for Student 10:
Test 1: 88
Test 2: 33
Test 3: 11
Test 4: 22
Test 5: 44
Enter grades for Student 11:
Test 1: 99
Test 2: 99
Test 3: 99
Test 4: 99
Test 5: 99
Enter grades for Student 12:
Test 1: 88
Test 2: 88
Test 3: 88
Test 4: 88
Test 5: 88

Class Grades:
Student\Test	Test 1	Test 2	Test 3	Test 4	Test 5
Student 1:	55	66	77	88	99	
Student 2:	55	66	77	88	99	
Student 3:	99	88	77	66	55	
Student 4:	11	22	33	44	55	
Student 5:	22	11	33	44	66	
Student 6:	33	44	22	45	66	
Student 7:	44	55	33	44	22	
Student 8:	33	44	55	66	77	
Student 9:	11	33	55	66	8	
Student 10:	88	33	11	22	44	
Student 11:	99	99	99	99	99	
Student 12:	88	88	88	88	88	

Average grade for Student 3: 77.0
Average grade for Test 2: 54.083333333333336
 */