package assistedproblem.EmployeeManagementSystem;

public class Intern extends Employee {
    public  String university ;

    public Intern(String name,int id,int salary,String university){
        super(name, id, salary);
        this.university = university;
    }

    @Override
    public void displayDetails(){
        System.out.println("Intern details are :");
        System.out.println(" Intern Name : "+name);
        super.displayDetails();
    }
}
