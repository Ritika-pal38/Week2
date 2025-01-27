package problemstatement.bankingsystem;

public class SavingsAccount  extends BankAccount implements Loanable {
    private double interestRate;
    private boolean hasLoan;

    public SavingsAccount(int accountNumber, String holderName, double initialBalance, double interestRate) {
        super(accountNumber, holderName, initialBalance);
        this.interestRate = interestRate;
        this.hasLoan = false;
    }

    @Override
    double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of $" + amount + " approved for account " + getAccountNumber());
            deposit(amount);
            hasLoan = true;
        } else {
            System.out.println("Loan application rejected for account " + getAccountNumber());
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 1000; // Example eligibility: balance > $1000
    }
}