package se.lexicon.part2;

import java.util.UUID;

public class StringDemo {

    public static void main(String[] args) {
        //String greeting = new String("Hello");
        String greeting = "Hello";
        greeting = greeting.concat(" World!"); // Hello World!

        String str = "Hello, World!";
        System.out.println("Length: " + str.length()); // Output: 13

        System.out.println("Character at index 2: " + str.charAt(2)); // l

        System.out.println("----------------------");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println("Ex3: ");
        // To call a static method: ClassName.methodName();
        ex3();
    }


    public static void ex1() {
        String string = "Hello Strings";
        int index1 = string.indexOf("llo"); // Output: 2
        int index2 = string.indexOf('H'); // Output: 0
        System.out.println(index1);
        System.out.println(index2);
    }

    public static void ex2() {
        String welcome = "Welcome";
        System.out.println(welcome.substring(3)); // come
        System.out.println(welcome.substring(1, 5)); // elco
        // index number 5 is exclusive
        String uuid = UUID.randomUUID().toString();
        System.out.println("UUID: " + uuid.substring(3, 8).toUpperCase());
    }

    public static void ex3(){
        String text1 = "java";
        String text2 = "Java";
        System.out.println(text1.equalsIgnoreCase(text2)); // true
        System.out.println(text1.equals(text2)); // false

    }

}
