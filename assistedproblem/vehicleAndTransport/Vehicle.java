package assistedproblem.vehicleAndTransport;

public class Vehicle {
    protected  double maxSpeed;
    protected String fuelType;

    public Vehicle (double maxSpeed,String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo(){
        System.out.println("Vehicle details are :");
        System.out.println("Maximum speed : "+maxSpeed+"\n"+"Fuel type : "+fuelType);
    }

}
