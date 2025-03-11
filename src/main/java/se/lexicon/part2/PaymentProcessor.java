package se.lexicon.part2;

public class PaymentProcessor {

    // For credit card
    public static void processPayment(String cardNumber, String cvv, double amount) {
        System.out.println("Processing credit card payment...");
    }


    // For bank transfer
    public static void processPayment(String bankAccount, String swiftCode, double amount, String currency) {
        System.out.println("Processing bank transfer payment...");
    }

    // add more methods as needed
}
