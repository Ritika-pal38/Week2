package hierarchicalinheritance.bankaccount;

public class BankAccount {
    protected int accountNumber;
    protected int balance;

    public BankAccount(int aNumber,int balance){
        this.accountNumber = aNumber;
        this.balance = balance;
    }

    public void displayAccountDetails(){
        System.out.println("Account details : ");
        System.out.println("Account number : "+accountNumber+", Balance : "+balance);
    }


}
