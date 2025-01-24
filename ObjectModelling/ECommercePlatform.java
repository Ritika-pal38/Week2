
import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

// Order Class
class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Products: " + products + ", Total: $" + calculateTotal();
    }
}

// Customer Class
class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Main Class
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create Products
        Product product1 = new Product("Laptop", 1000.0);
        Product product2 = new Product("Smartphone", 800.0);
        Product product3 = new Product("Headphones", 150.0);

        // Create Customer
        Customer customer = new Customer("Alice");

        // Create Order and Add Products
        Order order1 = new Order(1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(2);
        order2.addProduct(product3);

        // Customer Places Orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Display Orders
        System.out.println("Customer: " + customer.getName());
        for (Order order : customer.getOrders()) {
            System.out.println(order);
        }
    }
}

