package problemstatement.vehiclesystem;

public class Car extends Vehicle implements Insurable{
    private String model;
    private double insuranceRate = 0.02;

    public Car(String vehicleNumber, String model, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1)* insuranceRate; //Example insurance calculation
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Rate: " + (insuranceRate * 100) + "% of daily rental cost. Insurance cost for 1 day : $" + calculateInsurance();
    }
}
