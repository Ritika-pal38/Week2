package assistedproblem.EmployeeManagementSystem;

public class Developer extends Employee {
    public String programmingLanguage ;

    public Developer(String name,int id,int salary,String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails(){
        System.out.println("Developer details are :");
        super.displayDetails();
        System.out.println("Programming language : "+programmingLanguage);
        System.out.println("================");
    }
}
