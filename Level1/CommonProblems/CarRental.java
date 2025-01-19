class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double pricePerDay = 50.0; // Example price per day

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * pricePerDay;
    }
}