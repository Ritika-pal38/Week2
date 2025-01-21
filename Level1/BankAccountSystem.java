public class BankAccountSystem {

    public static void main(String[]args){
       BankAccount check = new BankAccount("Riya",200213);
        if(check instanceof BankAccount ){
            System.out.println("check is an instance of BankAccount");
        }
        
        new BankAccount("Harsh",200241);
        BankAccount.displayTotalAccounts();
    }
    
}
class BankAccount{
      public static String bankName = "UCO";
      public static int totalAccounts = 0;
      final int accountNumber ;
      public String accountHolderName ;

      
      

      public BankAccount(String name, int number){
        this.accountHolderName = name;
        this.accountNumber = number;
        totalAccounts++;
      }
      


      
      static void displayTotalAccounts(){
        System.out.println("Total number of accounts : "+totalAccounts );
      }

}
 
