
import java.io.*;
import java.util.*;

public class Main {

    private static int score = 0;
    private static int questionIndex = 0;
    private static boolean[] userResponses;
    private static String[][] quizData = {
            {"What is the capital of Japan?", "A. Beijing", "B. Tokyo", "C. Seoul", "D. Bangkok", "B"},
            {"Which programming language is known as the 'mother of all languages'?", "A. Java", "B. Python", "C. Assembly", "D. Lisp", "C"},
            {"What is the largest ocean on Earth?", "A. Atlantic Ocean", "B. Indian Ocean", "C. Southern Ocean", "D. Pacific Ocean", "D"},
            {"Who is the author of 'To Kill a Mockingbird'?", "A. George Orwell", "B. J.K. Rowling", "C. Harper Lee", "D. Ernest Hemingway", "C"},
            {"What is the powerhouse of the cell?", "A. Nucleus", "B. Mitochondria", "C. Ribosome", "D. Endoplasmic Reticulum", "B"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        userResponses = new boolean[quizData.length];

        System.out.println("Welcome to the Unique Quiz App!");

        for (String[] question : quizData) {
            presentQuestion(question);

            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("\nTime's up! Moving to the next question.\n");
                    userResponses[questionIndex] = false;
                    timer.cancel();
                    nextQuestion();
                }
            };

            timer.schedule(task, 15000); // 15 seconds timeout
            String userAnswer = scanner.next().toUpperCase();
            task.cancel();
            timer.purge();

            if (userAnswer.equals(question[5])) {
                System.out.println("Correct!\n");
                userResponses[questionIndex] = true;
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + question[5] + ".\n");
            }

            nextQuestion();
        }

        displayResult();
    }

    private static void presentQuestion(String[] question) {
        System.out.println("\nQuestion " + (questionIndex + 1) + ": " + question[0]);
        for (int i = 1; i <= 4; i++) {
            System.out.println(question[i]);
        }
        System.out.print("Your answer: ");
    }

    private static void nextQuestion() {
        questionIndex++;
        if (questionIndex < quizData.length) {
            presentQuestion(quizData[questionIndex]);
        }
    }

    private static void displayResult() {
        System.out.println("\n********** Quiz Completed **********");

        System.out.println("\nSummary of Answers:");
        for (int i = 0; i < quizData.length; i++) {
            System.out.println("Question " + (i + 1) + ": " +
                    (userResponses[i] ? "Correct" : "Incorrect"));
        }
        System.out.println();
         System.out.println("******* Your Final Score: " + score + "/" + quizData.length+" *******");
    }
}
