class Vehicle{
    public static int registrationFee = 1500;
    protected final int registrationNumber;
    protected String ownerName;
    protected String vehicleType;

    Vehicle(String ownerName,String type,int Rnumber){

        this.ownerName = ownerName;
        this.vehicleType = type;
        this.registrationNumber = Rnumber;

    }

    public static void updateRegistrationFee(int newRFee){
        registrationFee = newRFee;
    }
    public void printDetails(){
        if(this instanceof Vehicle){
            System.out.println("this is an instance of Vehicle class");
            System.out.println("Vehicles details : ");
            System.out.println("Owner name : "+ownerName+"\n"+"Vehicle type : "+vehicleType+"\n"+"Registration Fee : "+registrationFee+"\n"+"Registration number : "+registrationNumber);
        }
        else{
            System.out.println("this is not an instance of Vehicle class");
        }
    }


}

public class VehicleRegistrationSystem {
    public static void main(String[]args){
        Vehicle obj = new Vehicle("Mr Bob","Car",7894);
        obj.updateRegistrationFee(2000);
        obj.printDetails();

    }

}
