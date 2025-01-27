package problemstatement.fooddeliverysystem;
import java.util.*;

public class Order implements Discountable {
    private List<FoodItem> items;
    private double discountRate = 0;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(FoodItem item) {
        this.items.add(item);
    }

    public List<FoodItem> getItems(){
        return items;
    }

    public double calculateOrderTotal() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.calculateTotalPrice();
        }
        return total;
    }

    @Override
    public double applyDiscount(double discountRate) {
        this.discountRate = discountRate;
        return calculateOrderTotal() * (1 - discountRate);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + (discountRate * 100) + "%";
    }

    public void displayOrderDetails() {
        System.out.println("Order Details:");
        for (FoodItem item : items) {
            item.getItemDetails();
        }
        double total = calculateOrderTotal();
        System.out.println("Subtotal: $" + total);
        if (discountRate > 0) {
            System.out.println(getDiscountDetails());
            System.out.println("Total after discount: $" + applyDiscount(discountRate));
        } else {
            System.out.println("Total: $" + total);
        }
    }
}

