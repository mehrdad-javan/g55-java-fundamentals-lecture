package se.lexicon;


import java.util.Scanner;

public class LoopExamples {
    public static void main(String[] args) {

        System.out.println("Basic Iteration");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        System.out.println("Even Numbers");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }


        System.out.println("Using continue to skip an iteration");
        for (int i = 1; i <= 10; i++) {
            if (i == 6){
                continue;
            }
            if (i % 2 == 0){
                System.out.println(i);
            }
        }


        System.out.println("Using Break to stop the loop");
        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                break;
            }
            System.out.println(i);
        }


        System.out.println("While Loop:");

        // Scanner
        Scanner scanner = new Scanner(System.in);

        boolean loggedIn = false;
        while (!loggedIn){
            System.out.println("Enter Username: ");
            String username = scanner.nextLine();
            System.out.println("Enter Password: ");
            String password = scanner.nextLine();

            if (username.equals("admin") && password.equals("123456")){
                loggedIn = true;
                System.out.println("Login successful! Welcome to My App");
            } else {
                System.out.println("Incorrect credentials. Try again.");
            }
        }

        System.out.println("Do While:");

        boolean isContinue = false;
        do {
            System.out.println("1. Order Burger");
            System.out.println("2. Order Pizza");
            System.out.println("3. Logout");

        } while (isContinue);
    }
}
