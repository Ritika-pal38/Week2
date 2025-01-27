package multilevelinheritance.onlineorder;

public class Order {
    protected int orderId;
    protected String orderDate;

    public Order(int id, String orderDate){
        this.orderId = id;
        this.orderDate = orderDate;
    }



    public void getOrderStatus(){
        System.out.println("Order details are:");
        System.out.println("Order id : "+orderId+", OrderDate : "+orderDate);
    }

}
