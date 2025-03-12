package se.lexicon.part2.exercise;

public class StringExercises {

    public static void main(String[] args) {
        task1();
    }


    // 1. What is the length of the String: "Java"?
    private static void task1() {
        String str1 = "Java";
        System.out.println("1. Length of the String: " + str1.length());
    }

    // 2. What char is at index position 6 in the following String: "Long example sentence"?
    private static void task2() {
        String str2 = "Long example sentence";
        char charAtIndex6 = str2.charAt(6);
        System.out.println("2. Char at index 6: " + charAtIndex6);
    }

    // 3. What is the index position of 'o' in the following String: "Even longer example sentence"?
    private static void task3() {
        String str3 = "Even longer example sentence";
        int indexOfO = str3.indexOf('o');
        System.out.println("3. Index of 'o': " + indexOfO);
    }

    // 4. Given the following String: "Ok this is not as long!", create a substring of only "not as long" (excluding the exclamation point) and print it out.
    private static void task4() {
        String str4 = "Ok this is not as long!";
        String subString = str4.substring(str4.indexOf("not"), str4.indexOf("!"));
        System.out.println("4. Substring: " + subString);
    }

    // 5. Convert the following String: "CAPS EQUALS SCREAMING" to lowercase and print it out. Then convert it back to uppercase and print it out again.
    private static void task5() {
        String str5 = "CAPS EQUALS SCREAMING";
        System.out.println("5. Original: " + str5);
        str5 = str5.toLowerCase();
        System.out.println("   Lowercase: " + str5);
        str5 = str5.toUpperCase();
        System.out.println("   Uppercase: " + str5);
    }

    // 6. What is the output of the following String: "\tJ\ta\tv\ta\t" after you trim it?
    private static void task6() {
        String str6 = "\tJ\ta\tv\ta\t";
        String trimmedStr6 = str6.trim();
        System.out.println("6. Trimmed String: " + trimmedStr6);
    }

    // 7. Parse the following int: 20 to a String and add a 20 to the end of the String. Printing it out should return: "2020".
    private static void task7() {
        int number = 20;
        String str7 = String.valueOf(number) + "20";
        System.out.println("7. Combined String: " + str7);
    }

    // 8. Oil and water don't go well together. Given the String: "Oil and Water", split them up into the words "Oil","Water" and store them in a String array.
    private static void task8() {
        String str8 = "Oil and Water";
        String[] words = str8.split(" ");
        System.out.println("8. Words: " + words[0] + ", " + words[1]);
    }

    // 9. Split the following String: "Carl,Susie,Fredrick,Bob,Erik" into an array. Print out all names separately.
    private static void task9() {
        String str9 = "Carl,Susie,Fredrick,Bob,Erik";
        String[] names = str9.split(",");
        System.out.println("9. Names:");
        for (String name : names) {
            System.out.println("   " + name);
        }
    }

    // 10. Convert the following String: "ThisShouldBeConverted" to a char array. Iterate through the char array and print out each element.
    private static void task10() {
        String str10 = "ThisShouldBeConverted";
        char[] charArray = str10.toCharArray();
        System.out.println("10. Char Array:");
        for (char ch : charArray) {
            System.out.println("   " + ch);
        }
    }

    // 11. Convert the following char[]: {'J','a','v','a'} to a String and print it out.
    private static void task11() {
        char[] charArray11 = {'J', 'a', 'v', 'a'};
        String convertedString = new String(charArray11);
        System.out.println("11. Converted String: " + convertedString);
    }
}
