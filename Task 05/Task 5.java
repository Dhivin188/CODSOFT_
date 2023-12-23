import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        int courseCode[] = {1, 2, 3, 4,5};
        String courses[] = {"Java", "HTML", "C", "CSS","JAVASCRIPT"};
        int capacity[] = {1, 6, 2, 5, 7};
        String description[] = {"Programming", "Designing", "Programming", "Designing","Designing"};
        String schedule[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        // Display Courses
        System.out.println("================== COURSES OFFERED ==================");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-6s%-15s%-14s%-20s%-15s%n", "Code", "Name", "Capacity", "Description", "Schedule");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i <= 4; i++) {
            System.out.printf("%-6d%-15s%-14d%-20s%-15s%n", courseCode[i], courses[i], capacity[i], description[i], schedule[i]);
        }
        System.out.println("-----------------------------------------------------\n\n");

        Scanner scanner = new Scanner(System.in);
        int choice;
        String ch;
        RegisterCourse register = new RegisterCourse();
        System.out.println("============== STUDENT COURSES PORTAL ==============");
        do {
            System.out.println("\n\n1. Register Course\n2. Drop Course\n3. Exit");
            System.out.print("Enter option: ");
            choice = scanner.nextInt();
            System.out.println("\n\n");
            switch (choice) {
                case 1:
                    register.registerCourses(courses);
                    break;
                case 2:
                    register.dropCourses(courses);
                    break;
                case 3:
                    System.out.println("===================== THANK YOU =====================");
                    System.exit(0);
                default:
                    System.out.println("Enter a valid choice");
            }
            System.out.println("Do you want to register/drop more courses?\n['y' for Yes / 'n' for No]");
            ch = scanner.next();
        } while (!ch.equals("n"));
    }
}

class RegisterCourse {

    // Registration
    void registerCourses(String courses[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------");
        System.out.println("------------------- REGISTRATION --------------------");
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Name: ");
        String sname = scanner.next();
        System.out.print("Enter course code to register: ");
        int reg = scanner.nextInt();
        System.out.println("Registered Course " + courses[reg - 1] + " successfully\n");
    }

    // Drop courses
    void dropCourses(String courses[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------");
        System.out.println("------------------- DROP COURSES --------------------");
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Name: ");
        String sname = scanner.next();
        System.out.print("Enter course code to drop: ");
        int reg = scanner.nextInt();
        System.out.println("Dropped Course " + courses[reg - 1] + " successfully\n");
    }
}

