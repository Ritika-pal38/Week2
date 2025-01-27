package multilevelinheritance.onlineorder;

public class OrderManagement {
    public static void main(String[] args) {
        Order newOrder = new Order(007,"10/01/2025");
        ShippedOrder shippedOrder = new ShippedOrder(007,"10/01/2025",45621);
        DeliveredOrder deliveredOrder = new DeliveredOrder(007,"10/01/2025",45621,"25/01/2025");
        newOrder.getOrderStatus();
        shippedOrder.getOrderStatus();
        deliveredOrder.getOrderStatus();
    }
}
