package problemstatement.vehiclesystem;

public class Bike extends Vehicle implements Insurable{
    private String brand;
    private double insuranceRate = 0.01;

    public Bike(String vehicleNumber, String brand, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1)* insuranceRate;//Example insurance calculation
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Rate: " + (insuranceRate * 100) + "% of daily rental cost. Insurance cost for 1 day : $" + calculateInsurance();
    }
}
