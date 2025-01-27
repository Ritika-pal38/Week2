package problemstatement.bankingsystem;

public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String holderName, double initialBalance, double overdraftLimit) {
        super(accountNumber, holderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    double calculateInterest() {
        return 0; // Current accounts typically don't earn interest
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (amount <= getBalance() + overdraftLimit)) {
            double actualWithdrawal = Math.min(amount, getBalance());
            super.withdraw(actualWithdrawal);
            if (amount > getBalance()){
                System.out.println("Withdrawn $" + (amount - getBalance()) + " from overdraft.");
            }
        } else {
            System.out.println("Withdrawal amount exceeds balance and overdraft limit.");
        }
    }
}
