class Employee{
  public static String companyName = "Microsoft";
  public String Employee_name ;
  final int id;
  protected String designation ;
  protected static int TotalEmployee = 0;
  Employee(String name,int id,String designation){
    this.Employee_name = name;
    this.id = id;
    this.designation = designation;
    TotalEmployee++;
  }
  public void displayDetails(){
    if(this instanceof Employee){
      System.out.println("this is an instance of Employee class");
      System.out.println("Employee Details are : ");
      System.out.println("Company name is :"+companyName);
      System.out.println("Employee name : "+Employee_name+"\n"+"Employee_id : "+id+"\n"+"Designation : "+designation);
    }
    else{
      System.out.println("this is not an instance of Employee class");
    }
  }
  
  public static void displayTotalEmployees(){
      System.out.println("The total number of employees are : "+TotalEmployee);
  }
}


public class EmployeeManegementSystem {
  public static void main(String[]args){
     Employee obj = new Employee("Sadhna",101,"Analyst");
     Employee obj2 = new Employee("David",120, "Manager");
     obj.displayDetails();
     //Employee.id = 102;cannot assign a value to final variable id
    
     obj2.displayDetails();

     obj.displayTotalEmployees();


  }
}
