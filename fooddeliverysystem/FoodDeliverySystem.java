package problemstatement.fooddeliverysystem;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        VegItem veg1 = new VegItem("Veggie Burger", 5, 2);
        NonVegItem nonVeg1 = new NonVegItem("Chicken Burger", 7, 1, 1.5);
        VegItem veg2 = new VegItem("Fries", 3, 3);

        Order order1 = new Order();
        order1.addItem(veg1);
        order1.addItem(nonVeg1);
        order1.addItem(veg2);

        order1.displayOrderDetails();

        System.out.println();

        Order order2 = new Order();
        order2.addItem(new VegItem("Pizza", 10, 1));
        order2.addItem(new NonVegItem("Chicken Wings", 8, 2, 2));

        order2.displayOrderDetails();
        System.out.println();
        order2.applyDiscount(0.1);
        order2.displayOrderDetails();
    }

}
