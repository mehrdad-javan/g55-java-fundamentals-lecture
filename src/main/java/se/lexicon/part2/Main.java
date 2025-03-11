package se.lexicon.part2;

public class Main {

    public static void main(String[] args) {

        //System.out.println(MathOperations.add(10, 20, 30, 40));

        System.out.println(NumberGenerator.generateRandomNumber()); //
        System.out.println(NumberGenerator.generateRandomNumber(10, 80));
        System.out.println(NumberGenerator.generateRandomUUID());

    }
}
