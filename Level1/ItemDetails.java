class Item{
    int ItemCode ;
    String ItemName ;
    double price ;


    public void displayDetails(int ItemCode,String ItemName,double price){
        System.out.println("Item Details are :"+"\n"+"ItemCode : "+ItemCode);
        System.out.println("ItemName : "+ItemName+"\n"+"Price is : "+price+" per kg.");
        System.out.println("The cost of 4 kg "+ItemName+" is "+price*4);
    }
}
public class ItemDetails {
    public static void main(String[] args){
        Item obj = new Item();
        obj.displayDetails(112,"Sugar",45);

    }

}
