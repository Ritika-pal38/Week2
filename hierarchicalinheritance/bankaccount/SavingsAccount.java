package hierarchicalinheritance.bankaccount;

public class SavingsAccount extends BankAccount{

    protected double interestRate;

    public SavingsAccount(int aNumber,int balance,double interestRate){
        super(aNumber, balance);
        this.interestRate = interestRate;

    }
    @Override
    public void displayAccountDetails(){
        super.displayAccountDetails();
        System.out.println("Account Type : Savings Account");
        System.out.println("Interest Rate : "+interestRate+"%");
    }
}
