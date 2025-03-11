package se.lexicon.part2;

import java.util.Random;
import java.util.UUID;

public class NumberGenerator {


    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt();
    }


    public static int generateRandomNumber(int min, int max) { // min: 10 - max: 80
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static String generateRandomUUID() {
        return UUID.randomUUID().toString();
    }


}
