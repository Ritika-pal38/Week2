package multilevelinheritance.onlineorder;

public class ShippedOrder extends Order {
    protected int trackingNumber;

    public ShippedOrder(int id, String orderDate, int trackingNumber) {
        super(id, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking number : " + trackingNumber);
    }
}
