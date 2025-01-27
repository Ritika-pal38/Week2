package problemstatement.vehiclesystem;
import java.util.*;

public class VehicleRentalSystem {
    public static void printRentalAndInsurance(List<Vehicle> vehicles, int days) {
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(days);
            System.out.println(vehicle);
            System.out.println("Rental Cost for " + days + " days: $" + rentalCost);
            if (vehicle instanceof Insurable) {
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("KA01AA1234", "Sedan", 50));
        vehicles.add(new Bike("KA02BB5678", "Mountain Bike", 20));
        vehicles.add(new Truck("KA03CC9012", 5000, 100));
        vehicles.add(new Car("KA04DD3456", "SUV", 75));

        printRentalAndInsurance(vehicles, 5);
    }
}

