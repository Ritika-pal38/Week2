package problemstatement.ecommerce;

public class Clothing extends Product implements Taxable {
        private String size;
        private double taxRate = 0.08; //8% tax
        public Clothing(int productId, String name, double price, String size) {
            super(productId, name, price);
            this.size = size;
        }
        public String getSize(){
            return size;
        }

        @Override
        double calculateDiscount() {
            return getPrice() * 0.10; // 10% discount
        }

        @Override
        public double calculateTax() {
            return getPrice() * taxRate;
        }

        @Override
        public String getTaxDetails() {
            return "Clothing Tax (" + (taxRate * 100) + "%): $" + calculateTax();
        }
    }


