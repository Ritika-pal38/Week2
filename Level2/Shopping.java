import java.util.Scanner; 
public class Shopping {
    
   
    public static void main(String[] mmg)
    { 
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("Enter item name"); 
         String  item_name = sc.nextLine(); 
        
         System.out.println("Enter quantity of an element"); 
          int  quantity = sc.nextInt(); 
        
          System.out.println("Enter price of an item"); 
          double  price = sc.nextDouble();  
           sc.nextLine(); 
          System.out.println("Enter your Name"); 
          String name = sc.nextLine(); 

          System.out.println("Enter your mobile number"); 
          int Mob_no = sc.nextInt(); 
          
            Cart item = new Cart(item_name,quantity,price,name,Mob_no);  

            item.display();  
            //sc.close(); 
    }
}
class Cart
{ public String item; 
  public int quantity; 
  public double price;
  public int cart =0; 
  public double total_cost=0.0;   
  public String name; 
  public int Mob_no; 
  public Cart(String item_name,int quantity,Double price,String name,int Mob_no)
  { 
      
     this.item = item_name;
     this.quantity = quantity; 
     this.price = price; 
     this.name =name; 
     this.Mob_no =Mob_no; 
  } 
   
  
   public double total_cost()
   { 
     total_cost= quantity * price;  
     return total_cost; 
   } 
   

   public void display() 
{     System.out.println("Mr/Miss/Mrs. "+name);
      System.out.println(Mob_no);  
      System.out.println("Item name is :"+ item); 
      System.out.println("Total item in a cart :"+ quantity); 
      System.out.println("Total cost of items :"+ total_cost() + " Ruppess only");     
   }
}