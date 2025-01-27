package hybridinheritance.vehicles;

public class VehicleManagement {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(24,"Activa 6g");
        ElectricVehicle electric = new ElectricVehicle(20,"JupiterNew");
        PetrolVehicle petrol = new PetrolVehicle(25,"Apache");
        electric.showDetails();
        electric.refuel();
        System.out.println("///////////////////////////");
        petrol.showDetails();
        petrol.refuel();

    }
}
