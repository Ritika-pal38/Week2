package hierarchicalinheritance.bankaccount;

public class FixedDepositAccount extends BankAccount{

    protected int  depositTerm;

    public FixedDepositAccount(int aNumber,int balance,int depositTerm){
        super(aNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    public void displayAccountDetails(){
        super.displayAccountDetails();
        System.out.println("Account Type : Fixed deposit account ");
        System.out.println("Deposit term : "+depositTerm+" years");
    }
}
