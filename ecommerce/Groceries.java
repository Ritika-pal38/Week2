package problemstatement.ecommerce;

public class Groceries extends Product {
    private String expiryDate;

    public Groceries(int productId, String name, double price, String expiryDate) {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    double calculateDiscount() {
        return 0; // No discount on groceries in this example
    }
}

