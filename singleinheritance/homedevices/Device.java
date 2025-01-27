package singleinheritance.homedevices;

public class Device {
    protected int deviceId;
    protected String status;

    public Device(int id,String status){
        this.deviceId = id;
        this.status = status;
    }

    public void displayStatus(){
        System.out.println("Device D details are : ");
        System.out.println("Device id : "+deviceId+", Status : "+status);
    }
}
