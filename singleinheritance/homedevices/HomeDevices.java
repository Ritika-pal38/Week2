package singleinheritance.homedevices;

public class HomeDevices {
    public static void main(String[] args) {
     Device D = new Device(110,"Available");
     Thermostat T = new Thermostat(201,"Active",23);
     D.displayStatus();
     T.displayStatus();
    }
}
