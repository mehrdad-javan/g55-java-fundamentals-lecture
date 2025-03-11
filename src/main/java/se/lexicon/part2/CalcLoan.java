package se.lexicon.part2;

public class CalcLoan {
    static double interestRate = 5.0;

    public static double calculateLoanRepayment(double amount, int years) {
        double totalPayment = amount + (amount * (interestRate / 100) * years);
        return totalPayment;
    }

}
