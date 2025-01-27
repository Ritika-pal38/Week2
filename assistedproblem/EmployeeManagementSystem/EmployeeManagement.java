package assistedproblem.EmployeeManagementSystem;

public class EmployeeManagement {
    public static void main(String[]args){
        Employee manager = new Manager("David",102,28700,4);
        Employee developer = new Developer("Gagan",287,35000,"Java");
        Employee intern = new Intern("Calvin",270,18000,"RGPV");

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();

    }
}
