import java.util.Scanner;
class ShoppingCart{
    private static float discount = 5;
    public String ProductName;
    public float price;
    public int quantity;
    protected final int productID ; 
    
    

    ShoppingCart(String Pname,float price,int quantity ,int ID ){
        this.ProductName = Pname;
        this.price = price;
        this.quantity = quantity;
        this. productID = ID;

    }

    public static void updateDiscount(float newDiscount){

     discount = newDiscount;
     
    }
    public void printDetails(){
        if(this instanceof ShoppingCart){
            System.out.println("this is an instance of ShoppingCart class");
            System.out.println("Product deatils are  : ");
            System.out.println("Product name : "+ProductName+"\n"+"Product ID : "+productID+"\n"+"Price : "+price+"\n"+"Quantity : "+quantity+"\n"+"Actual to total amount : "+(price*quantity)+"\n"+"Discount offered : "+discount+"\n"+"Discounted price :"
            +((price*quantity)-(((price*discount)/100)*quantity)));
        }
        else{
            System.out.println("this is not an instance of ShoppingCart class");
        }
    }

    
}


public class ShoppingCartSystem {
    public static void main(String[]args){
        ShoppingCart obj = new ShoppingCart("Sugar",40,4,112);
        obj.updateDiscount(10);
        obj.printDetails();

    }

}
