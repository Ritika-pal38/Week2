package hierarchicalinheritance.bankaccount;

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1001, 5000, 3.5);
        CheckingAccount checking = new CheckingAccount(1002, 2000, 1000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount(1003, 10000, 5);

        System.out.println("====================");
        savings.displayAccountDetails();


        System.out.println("====================");
        checking.displayAccountDetails();


        System.out.println("====================");
        fixedDeposit.displayAccountDetails();
    }
}
