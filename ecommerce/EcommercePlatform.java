package problemstatement.ecommerce;
import java.util.*;

public class EcommercePlatform {

        public static void printFinalPrice(List<Product> products) {
            for (Product product : products) {
                double discount = product.calculateDiscount();
                double tax = 0;
                String taxDetails = "";
                if (product instanceof Taxable) {
                    tax = ((Taxable) product).calculateTax();
                    taxDetails = ((Taxable) product).getTaxDetails();
                }
                double finalPrice = product.getPrice() + tax - discount;

                System.out.println(product);
                System.out.println("Discount: $" + discount);
                System.out.println(taxDetails);
                System.out.println("Final Price: $" + finalPrice);
                System.out.println();
            }
        }

        public static void main(String[] args) {
            List<Product> products = new ArrayList<>();
            products.add(new Electronics(1, "Laptop", 1200, "Dell"));
            products.add(new Clothing(2, "T-Shirt", 25, "M"));
            products.add(new Groceries(3, "Milk", 3, "2024-03-15"));
            products.add(new Electronics(4, "Headphones", 100, "Sony"));
            products.add(new Clothing(5, "Jeans", 50, "L"));

            printFinalPrice(products);
        }
    }


