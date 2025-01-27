package assistedproblem.vehicleAndTransport;
import java.util.*;

public class VehicleHierarchy {

    public static void main(String[] args) {
        Vehicle [] vehicles = {
                new Car(25.4, "petrol", 5),
                new Truck(45, "diesel", "Bricks"),
        new Motorcycle(23, "Petrol", "Hero"),

                };
        for(int i = 0;i< vehicles.length;i++){
            vehicles[i].displayInfo();

        }

    }
}
