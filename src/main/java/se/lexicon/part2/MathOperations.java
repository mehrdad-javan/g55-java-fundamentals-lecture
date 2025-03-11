package se.lexicon.part2;

public class MathOperations {


    public static int add(int num1, int num2) {
        return num1 + num2;
    }


    public static double add(double num1, double num2) {
        return num1 + num2;
    }


    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }


}
