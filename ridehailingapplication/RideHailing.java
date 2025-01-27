package problemstatement.ridehailingapplication;

public class RideHailing {
    public static double calculateFareForVehicle(Vehicle vehicle, double distance) {
        return vehicle.calculateFare(distance);
    }

    public static void main(String[] args) {
        Car myCar = new Car(1, "Alice", 2.0);
        Bike myBike = new Bike(2, "Bob", 1.0);
        Auto myAuto = new Auto(3, "Charlie", 1.5); // Auto object created

        myCar.updateLocation("Central Park");
        myBike.updateLocation("Beach");
        myAuto.updateLocation("Downtown");

        System.out.println(myCar.getVehicleDetails());
        System.out.println("Car fare for 5 km: $" + calculateFareForVehicle(myCar, 5));

        System.out.println(myBike.getVehicleDetails());
        System.out.println("Bike fare for 5 km: $" + calculateFareForVehicle(myBike, 5));

        System.out.println(myAuto.getVehicleDetails()); // Auto details printed
        System.out.println("Auto fare for 5 km: $" + calculateFareForVehicle(myAuto, 5)); //Auto fare calculated

        Vehicle[] vehicles = {myCar, myBike, myAuto}; // Auto added to the array
        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleDetails());
            System.out.println("Fare for 3 km: $" + calculateFareForVehicle(v, 3));
            System.out.println("Current Location: " + v.getCurrentLocation());
        }
    }
}


