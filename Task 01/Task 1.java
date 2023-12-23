import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int random;
        Random rand = new Random();
        random = rand.nextInt(100);
        NumberGame ng = new NumberGame();
        ng.playGame(random);
    }
}

class NumberGame {
    public void playGame(int randomNumber) {
        int guess, attempt = 1, score = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("******* WELCOME TO NUMBER GAME *******");
        System.out.println("You have 5 attempts!");

        while (attempt <= 5) {
            System.out.println("---------------------------------------------\n");
            System.out.println("_____ATTEMPT " + attempt + "_____");
            System.out.println("Enter your guess:");
            guess = scanner.nextInt();

            if (randomNumber == guess) {
                System.out.println("Your guess was right!");
                break;
            } else if (randomNumber < guess) {
                System.out.println("Guess is greater than the actual number!");
            } else {
                System.out.println("Guess is less than the actual number!");
            }

            attempt++;

            if (attempt == 6) {
                System.out.println("\nYou have crossed the maximum attempt limit!\n\n\t\t****** BETTER LUCK NEXT  TIME ******");
            }
        }

        if (attempt == 1) {
            score = 100;
        } else if (attempt >= 2 && attempt <= 3) {
            score = 50;
        } else if (attempt >= 4 && attempt <= 5) {
            score = 25;
        }

        System.out.println("Your score is " + score);
    }
}
