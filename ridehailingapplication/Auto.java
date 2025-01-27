package problemstatement.ridehailingapplication;

public class Auto extends Vehicle { // Auto class added back
    public Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9;
    }
}

