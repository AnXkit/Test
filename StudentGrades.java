package arrays;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] studentNames = new String[10];
        double[] studentMarks = new double[10];
        
        // Input student names and marks
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = sc.nextLine();
            
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            studentMarks[i] = sc.nextDouble();
            
            // Consume the newline character left in the buffer
            sc.nextLine();
        }
        
        // Calculate and display grades
        for (int i = 0; i < 10; i++) {
            char grade;
            
            // Use a switch-case statement to determine the grade
            switch ((int) studentMarks[i] / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                case 5:
                case 4:
                    grade = 'E';
                    break;
                default:
                    grade = 'F';
            }
            
            System.out.println(studentNames[i] + " scored " + studentMarks[i] + " marks and got grade " + grade);
        }
        
        sc.close();
    }
}
