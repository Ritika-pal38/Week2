package assistedproblem.vehicleAndTransport;

public class Car extends Vehicle {

    public int seatCapacity;

    public Car(double maxSpeed,String fuelType,int capacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = capacity;
    }

    @Override
    public  void displayInfo(){
        super.displayInfo();
        System.out.println("Seat capacity : "+seatCapacity);

    }

}
