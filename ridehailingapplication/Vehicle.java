package problemstatement.ridehailingapplication;
import java.util.*;

public abstract class Vehicle implements GPS {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = generateRandomLocation();
    }

    public int getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    @Override
    public String getCurrentLocation() { return currentLocation; }

    @Override
    public void updateLocation(String newLocation) { this.currentLocation = newLocation; }

    private String generateRandomLocation() {
        String[] locations = {"New York", "Los Angeles", "Chicago"};
        Random random = new Random();
        return locations[random.nextInt(locations.length)];
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "ID: " + vehicleId + ", Driver: " + driverName + ", Rate: $" + ratePerKm + "/km, Location: " + currentLocation;
    }
}


