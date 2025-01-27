package hybridinheritance.vehicles;

public class Vehicle {

    protected  double maxSpeed;
    protected String model;

    public Vehicle(double maxSpeed,String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void showDetails(){
        System.out.println("Vehicle max speed : "+maxSpeed+"\n"+"Vehicle model : "+model);
    }
}
