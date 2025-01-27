package assistedproblem.vehicleAndTransport;

public class Truck extends Vehicle{

    public String loading ;

    public Truck(double maxSpeed,String fuelType,String load){
        super(maxSpeed, fuelType);
        this.loading = load;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Loading : "+loading);
    }
}
