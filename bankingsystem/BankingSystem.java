package problemstatement.bankingsystem;
import java.util.*;

public class BankingSystem {
    public static void processAccounts(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            System.out.println(account);
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: $" + interest);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        SavingsAccount savingsAccount = new SavingsAccount(12345, "Aman", 5000, 0.02);
        CurrentAccount currentAccount = new CurrentAccount(67890, "Akshita", 10000, 5000);
        SavingsAccount savingsAccount2 = new SavingsAccount(13579, "Chetan", 500, 0.02);

        accounts.add(savingsAccount);
        accounts.add(currentAccount);
        accounts.add(savingsAccount2);

        savingsAccount.applyForLoan(500);
        savingsAccount2.applyForLoan(500);
        currentAccount.withdraw(12000);
        currentAccount.withdraw(2000);

        processAccounts(accounts);
    }

}
