package hybridinheritance.restaurent;

import java.awt.event.WindowAdapter;

public class RestaurantManagement {
    public static void main(String[] args) {
        Person person = new Person("Shyam",12);
        person.showDetails();
        System.out.println("*****************************");
        Chef obj = new Chef("David",112);
        obj.showDetails();
        obj.performDuties();
        System.out.println("*****************************");
        Waiter waiter = new Waiter("Jaya",26);
        waiter.showDetails();
        waiter.performDuties();

    }
}
