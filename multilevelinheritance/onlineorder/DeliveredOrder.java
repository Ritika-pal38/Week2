package multilevelinheritance.onlineorder;

public class DeliveredOrder extends ShippedOrder {

    protected String deliveryDate;

    public DeliveredOrder(int id, String orderDate,int trackingNumber,String deliveryDate){
        super(id,orderDate,trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Delivery Date : "+deliveryDate);
    }
}
