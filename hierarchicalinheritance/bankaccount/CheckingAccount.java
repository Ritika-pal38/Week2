package hierarchicalinheritance.bankaccount;

public class CheckingAccount extends BankAccount{

    protected int withdrawalLimit;

    public CheckingAccount(int aNumber,int balance,int withdrawalLimit){
        super(aNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    public void displayAccountDetails(){
        super.displayAccountDetails();
        System.out.println(" Account Type : Checking account");
        System.out.println("Withdrawal Limit : "+withdrawalLimit);

    }
}
