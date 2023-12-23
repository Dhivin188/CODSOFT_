import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.next();
        System.out.print("Enter your Roll number:");
        int roll = sc.nextInt();

        // Ask the user to enter the number of subjects
        System.out.println("Enter the number of subjects: ");
        int numberOfSubjects = sc.nextInt();

        // Create an array to store the marks obtained in each subject
        int[] marks = new int[numberOfSubjects];

        // Ask the user to enter the marks obtained in each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            do {
                System.out.println("*************************************************");
                System.out.println("Enter the marks obtained out of 100 in subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
                if (marks[i] > 100) {
                    System.out.println("Invalid input! Marks cannot be greater than 100. Please enter the correct mark.");
                }
            } while (marks[i] > 100);
        }

        // Calculate the total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate the average percentage
        float averagePercentage = (float) totalMarks / numberOfSubjects;

        // Assign a grade based on the average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "O";
        } else if (averagePercentage >= 80) {
            grade = "A+";
        } else if (averagePercentage >= 70) {
            grade = "A";
        } else if (averagePercentage >= 60) {
            grade = "B+";
        } else if (averagePercentage >= 50) {
            grade = "B";
        } else if (averagePercentage >= 40) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println("*******RESULT*******");
        System.out.println("Name : " + name);
        System.out.println("Roll number : " + roll);

        System.out.println("Total marks: " + totalMarks + "/" + (numberOfSubjects * 100));
        System.out.println("Average percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);

        // Close the Scanner object
        sc.close();
    }
}

