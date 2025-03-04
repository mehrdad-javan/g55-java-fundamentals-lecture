package se.lexicon;

public class HelloWorld {

    // This is a single line comment

    /*
    This is a regular multi-line comment
    It can span multiple lines
     */

    /**
     * This is a Java Doc <b>(Documentation Comments)</b>.
     * ## Used to create documentation for **Java Codes**
     */

    // psvm + Tab
    public static void main(String[] args) {
        // sout + Tab
        System.out.println("Hello World!");

        // Variables
        // [data type] [variableName];
        int speed;
        speed = 100;

        double salary = 50000.55;
        char grade = 'A';
        char specialChar = '\u2764'; // '❤'
        boolean isActive = true;
        boolean isReserved = false;

        long balance = 5000000000000L;
        double area = 20.55;
        int setNumber = 100;
        int studentId = 5000;
        System.out.println("Speed: " + speed);
        System.out.println("-----------------");

        int number1 = 10;
        int number2 = 5;

        int additionResult = number1 + number2;
        System.out.println("Addition: " + additionResult);
        int subtractionResult = number1 - number2;
        System.out.println("Subtraction: " + subtractionResult);
        // *   /  %
        int division = number1 / number2; // returns the quotient
        System.out.println("Division: " + division);
        int modules = number1 % number2; // returns the remainder of the division
        System.out.println("Modules: " + modules);

        // Increment (++) and Decrement (--) operators
        int counter = 0;
        System.out.println(++counter); // Output : 1

        int num1 = 500, num2 = 200, num3 = 10;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // (== , != , < , > , <=, >=)
        boolean isEqual = num1 == num2; // false
        System.out.println("Is Equal: " + isEqual);
        boolean result = num1 > num2; // true
        System.out.println("Is GraterThan: " + result);


        int age = 20;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote");
        }


        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 55 || marks <= 60) {
            System.out.println("Grade FX");
        } else {
            System.out.println("Grade F");
        }

        int dayOfWeek = 10;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day.");
        }

        String name = "Mehrdad";
        String lastName = "Javan";
        name = name.concat(" ").concat(lastName); // Mehrdad Javan
        System.out.println(name); // Mehrdad


    }

    // Reformat the Code: Ctrl + Alt + L
}
