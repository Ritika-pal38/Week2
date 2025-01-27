package problemstatement.ecommerce;
public class Electronics extends Product implements Taxable {
    private String brand;
    private double taxRate = 0.10; // 10% tax

    public Electronics(int productId, String name, double price, String brand) {
        super(productId, name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax (" + (taxRate * 100) + "%): $" + calculateTax();
    }
}
