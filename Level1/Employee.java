 class EmployeeDetails{
     String name;
	 int id;
	 double salary;
	 
	 EmployeeDetails(String name,int id,double salary){
	      this.name = name;
		  this.id = id;
		  this.salary = salary;
		}

	void displayDetails(){
	    System.out.println("Employee details are: " +"  Name : " +name +"  Id  : "+id  +"  Salary  : "+ salary);
		}
	}
class Employee{
	public static void main(String []args){
	    EmployeeDetails obj = new EmployeeDetails("Ritika",86,12000);
		obj.displayDetails();
		
		}
	}