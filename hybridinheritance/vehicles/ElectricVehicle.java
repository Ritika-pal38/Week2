package hybridinheritance.vehicles;

public class ElectricVehicle extends Vehicle implements Refuelable{

    public ElectricVehicle(double maxSpeed,String model){
        super(maxSpeed, model);
    }
    public void charge(){
        System.out.println("This vehicle runs by charging");
    }

    @Override
    public void refuel() {
        System.out.println("No, this vehicle do not require refueling");
    }
}
