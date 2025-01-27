package assistedproblem.EmployeeManagementSystem;

public class Employee {
    protected String name ;
    protected int id ;
    protected int salary ;

    public Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;

    }

    public void displayDetails(){
        System.out.println("Name : "+name+"\n"+"ID :"+id+"\n"+"Salary :"+salary);
    }
}
