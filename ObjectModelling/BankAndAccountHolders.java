import java.util.ArrayList;

class Bank{
    public String bankName;
    private int bankID;
    ArrayList<Customer> accounts;

    Bank(String name,int ID){
        this.bankName = name;
        this.bankID = ID;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(Customer c){
        accounts.add(c);
    }

    public void displayDetails() {
        for (int i = 0; i < accounts.size(); i++) {
            Customer account = accounts.get(i); // Retrieve the object from the ArrayList
            System.out.println("Bank name : " + bankName);
            System.out.println("Account holder name : " + accounts.get(i).name+"\n"+"Account number : "+accounts.get(i).getNumber()+"\nBalance : "+accounts.get(i).getBalance()); // Access the name field
        }
    }



}

class Customer{
    public String name;
    private int accountNumber;
    private int balance;

    Customer(String name,int aNumber,int balance){
        this.name = name;
        this.accountNumber = aNumber;
        this.balance = balance;
    }

    public int getNumber(){
        return accountNumber;

    }
    
    public void viewBalance(Customer c){
        System.out.println("Account holder name : "+name+"\n Account number : "+accountNumber+"\n Balance : "+balance);
    }
    public int getBalance(){
        return balance;
    }




}

public class BankAndAccountHolders {
    public static void main(String[]args){
        Customer c1 = new Customer("Ritika",23408 , 12000);
        Customer c2 = new Customer("Faraz",25784, 34990);
        Bank b = new Bank("UCO bank", 245);

        
        b.openAccount(c1);
        b.openAccount(c2);
    
        b.displayDetails();
    }

}
