package assistedproblem.vehicleAndTransport;

public class Motorcycle extends Vehicle{

    public String brand ;

    public Motorcycle(double maxSpeed,String fuelType,String brand){
        super(maxSpeed, fuelType);
        this.brand = brand;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Brand : "+brand);
    }
}
