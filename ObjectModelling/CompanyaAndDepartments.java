import java.util.ArrayList;

class Company{
    public String companyName = "Capgemini";
    ArrayList<Department> department;
    public int countDepartment = 0;

    Company(){
    
        this.department = new ArrayList<>();
    }

    public void addDepartment(Department d){
        department.add(d);
        countDepartment++;

    }

    public void displayDetails(){
        System.out.println("Company deatils are :");
        for(int i = 0;i<department.size();i++){
            
            department.get(i).displayDepartment();
        }
    }

}

class Department{
    public String departmentName;
    ArrayList<Employee> employee;
    public int countEmployee = 0;

    Department(String name){
        this.departmentName = name;
        this.employee = new ArrayList<>(); 
    }

    public void addEmployee(Employee e){
        employee.add(e);
        countEmployee++;

    }

    public void displayDepartment(){
        
        System.out.println("Department  Details are : ");
        System.out.println("Department - "+departmentName);
        for(int i = 0; i<employee.size();i++){

            employee.get(i).displayEmployee();

        }
    }


}
class Employee{
    public  String employeeName;
    public int employeeID;
    public String post;
    public int salary;

    Employee(String name,int ID,String post,int salary){
        this.employeeName = name;
        this.employeeID = ID;
        this.post = post;
        this.salary = salary;
    }

    public void displayEmployee(){
        System.out.printf("%-15s%-5d%-25s%-8d%n", employeeName, employeeID, post, salary);
        // System.out.println("Employee details are : ");
        // System.out.println("Employee name : "+employeeName+"\n"+"Employee ID : "+employeeID+"\nDesignation : "+post+"\nEmployee Salary : "+salary);
    }
    

}

public class CompanyaAndDepartments {
    public static void main(String[] args) {

    Company Capgemini = new Company();

    Department d1 = new Department("HR");
    Department d2 = new Department("Management");
    Department d3 = new Department("IT");
    Capgemini.addDepartment(d1);
    Capgemini.addDepartment(d2);
    Capgemini.addDepartment(d3);

    
    
    Employee e1 = new Employee("Pratham",101 ,"Senior_Recruiter", 45000);
    Employee e2 = new Employee("Ankit", 187, "HR", 38900);
    Employee e3 = new Employee("Aman", 209, "Senior manager",480000 );
    Employee e4 = new Employee("David", 278, "Assistant manager", 27000);
    Employee e5 = new Employee("Calvin", 389, "Trainee software engineer", 25000);
    Employee e6 = new Employee("Robin", 234, "Assistant analyst",26000);
    
    d1.addEmployee(e1);
    d1.addEmployee(e2);
    d2.addEmployee(e3);
    d2.addEmployee(e4);
    d3.addEmployee(e5);
    d3.addEmployee(e6);

    Capgemini.displayDetails();
        }

}
