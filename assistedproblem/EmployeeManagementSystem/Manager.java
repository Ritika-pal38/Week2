package assistedproblem.EmployeeManagementSystem;

public class Manager extends Employee {
    public int teamSize ;

    public Manager(String name,int id,int salary,int teamSize){
        super(name,id,salary);
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails(){
        System.out.println("Manager details are :");
        super.displayDetails();
        System.out.println("Team size :"+teamSize);
        System.out.println("================");
    }
            }
