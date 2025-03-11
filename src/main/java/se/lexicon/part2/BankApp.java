package se.lexicon.part2;

public class BankApp {

    public static void main(String[] args) {
        // Create two instances (objects)
        BankAccount account1 = new BankAccount(); // 5.0
        // Initialize fields for account1
        account1.accountHolder = "Mehrdad";
        account1.balance = 1000;

        BankAccount account2 = new BankAccount(); // 5.0
        account2.accountHolder = "Marcus";
        account2.balance = 2000;

        account1.displayAccountInfo();
        account2.displayAccountInfo();
        System.out.println("----------------");
        account1.deposit(5000);
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        System.out.println("----------------");
        account1.withdraw(2000);
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        System.out.println("----------------");
        System.out.println("InterestRate: " + CalcLoan.interestRate);
        System.out.println("Total Loan Repayment Amount: " + CalcLoan.calculateLoanRepayment(10000, 2));

    }
}
