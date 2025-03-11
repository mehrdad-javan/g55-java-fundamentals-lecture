package se.lexicon.part1;

import java.util.Random;
import java.util.Scanner;

/**
 * This class contains multiple exercises as separate methods.
 * Each method demonstrates a different fundamental concept in Java.
 */
public class Exercises {

    public static void main(String[] args) {
        System.out.println("Exercise 1:");
        printHello();

        // System.out.println("Exercise 2:");
        // checkLeapYear();
    }

    /**
     * Exercise 1:
     * Question: Write a Java program to print 'Hello' on screen and then print your name on a separate line.
     */
    public static void printHello() {
        System.out.println("Hello");
        System.out.println("Ali!");
    }

    /**
     * Exercise 2:
     * Question: Create a program that takes a year as input from the user and prints if it’s a leap year or not.
     */
    public static void checkLeapYear() {
        /*
         * Algorithm Breakdown or Pseudocode Comments
         * Step 1: Take the year as input from the console.
         * Step 2: Check if the year is divisible by 4 but not by 100, OR divisible by 400.
         * Step 3: Print whether the year is a leap year or not.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        // Step 1
        int year = scanner.nextInt();
        // Step 2
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            // Step 3
            System.out.println(year + " is a leap year.");
        } else {
            // Step 3
            System.out.println(year + " is not a leap year.");
        }
    }

    /**
     * Exercise 3:
     * Question: Write a Java program to print the sum, multiplication, division, and subtraction of two numbers.
     */
    public static void basicArithmetic() {
        /*
         * Algorithm Breakdown or Pseudocode Comments
         * Step 1: Perform addition, multiplication, division, and subtraction.
         * Step 2: Print the results.
         */
        System.out.println("45 + 11 = " + (45 + 11));
        System.out.println("12 * 4 = " + (12 * 4));
        System.out.println("24 / 6 = " + (24 / 6));
        System.out.println("55 - 12 = " + (55 - 12));
    }

    /**
     * Exercise 4:
     * Question: Write a Java program that prints the average of three numbers.
     */
    public static void calculateAverage() {
        /*
         * Algorithm Breakdown or Pseudocode Comments
         * Step 1: Define three numbers.
         * Step 2: Calculate their average.
         * Step 3: Print the result.
         */
        // Step 1
        int num1 = 23, num2 = 11, num3 = 77;
        // Step 2
        double average = (num1 + num2 + num3) / 3.0;
        // Step 3
        System.out.println("(" + num1 + " + " + num2 + " + " + num3 + ") / 3 = " + average);
    }

    /**
     * Exercise 5:
     * Question: Create a program that asks the user to input their name and prints ‘Hello username’.
     */
    public static void greetUser() {
        /*
         * Algorithm Breakdown or Pseudocode Comments
         * Step 1: Ask the user to enter their name.
         * Step 2: Print a greeting message including the name.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }

    /**
     * Exercise 8:
     * Question: Write a program that generates a random number (1-500) and allows the user to guess it.
     * Provide feedback for each guess.
     */
    public static void guessTheNumber() {
        /*
         * Algorithm Breakdown or Pseudocode Comments
         * Step 1: Generate a random number between 1 and 500.
         * Step 2: Ask the user to guess the number.
         * Step 3: If the guess is too low, print a hint.
         * Step 4: If the guess is too high, print a hint.
         * Step 5: If the guess is correct, congratulate the user and display the number of attempts.
         * Step 6: Repeat until the user guesses correctly.
         */
        Random random = new Random();
        // Step 1
        int targetNumber = random.nextInt(500) + 1;
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        System.out.println("Guess the number (between 1 and 500):");

        while (true) {
            System.out.print("Enter your guess: ");
            // Step 2
            guess = scanner.nextInt();
            // Step 3
            attempts++;

            if (guess == targetNumber) {
                // Step 4
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break;
            } else if (guess < targetNumber) {
                // Step 5
                System.out.println("Your guess was too small.");
            } else {
                // Step 6
                System.out.println("Your guess was too big.");
            }
        }
    }
}
