package problemstatement.fooddeliverysystem;

public class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}
