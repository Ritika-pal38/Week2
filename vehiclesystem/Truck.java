package problemstatement.vehiclesystem;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String vehicleNumber, double loadCapacity, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
        this.loadCapacity = loadCapacity;
    }
    public double getLoadCapacity(){
        return loadCapacity;
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}
