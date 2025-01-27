package problemstatement.fooddeliverysystem;

public class NonVegItem extends FoodItem {
    private double nonVegCharge;

    public NonVegItem(String itemName, double price, int quantity, double nonVegCharge) {
        super(itemName, price, quantity);
        this.nonVegCharge = nonVegCharge;
    }

    @Override
    double calculateTotalPrice() {
        return (getPrice() + nonVegCharge) * getQuantity();
    }
}
