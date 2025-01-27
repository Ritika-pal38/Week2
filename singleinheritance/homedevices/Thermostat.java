package singleinheritance.homedevices;

public class Thermostat extends Device{

    protected int temperatureSetting;

    public Thermostat(int id,String status,int temp){
        super(id, status);
        this.temperatureSetting = temp;
    }
    @Override
    public void displayStatus(){
        System.out.println("Device T deatails are :");
        super.displayStatus();
        System.out.println("Temperature : "+temperatureSetting+"C");
    }
}
