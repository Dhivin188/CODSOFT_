import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("***** ATM INTERFACE *****");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. EXIT");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ₹");
                    int withdrawAmount = sc.nextInt();
                    if (balance >= withdrawAmount) {
                        balance -= withdrawAmount;
                        System.out.println("Transaction successful! Please collect ₹"
                                + withdrawAmount + ".\n");
                    } else {
                        System.out.println("Insufficient Balance. Please try again.\n");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    int depositAmount = sc.nextInt();
                    balance += depositAmount;
                    System.out.println("Deposit successful! ₹" + depositAmount
                            + " has been added to your account.\n");
                    break;

                case 3:
                    System.out.println("Your Current Balance: ₹" + balance + "\n");
                    break;

                case 4:
                    System.out.println("\n********** THANK YOU **********");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.\n");
            }
        }
    }
}

