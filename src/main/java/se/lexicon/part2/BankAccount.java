package se.lexicon.part2;

public class BankAccount {
    // Fields
    String accountHolder;
    double balance;

    // Constructors

    // Methods


    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be a positive number.");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be a positive number.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient founds! :(");
        }
        balance -= amount;
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder + " , Balance: " + balance);
    }



}
