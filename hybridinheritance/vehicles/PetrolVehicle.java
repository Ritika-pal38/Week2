package hybridinheritance.vehicles;

public class PetrolVehicle extends Vehicle implements Refuelable{

    public PetrolVehicle(double maxSpeed,String model){
        super(maxSpeed, model);
    }

    @Override
    public void refuel(){
        System.out.println("Yes, this vehicle require refueling");
    }
}
