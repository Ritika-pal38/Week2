package problemstatement.employeemanagement;
import java.util.*;


    public class EmployeeManagement {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();

            FullTimeEmployee emp1 = new FullTimeEmployee(1, "Aryan", 50000, 60000);
            emp1.assignDepartment("Sales");
            PartTimeEmployee emp2 = new PartTimeEmployee(2, "Chetan", 20000, 160, 150);
            emp2.assignDepartment("Marketing");
            FullTimeEmployee emp3 = new FullTimeEmployee(3, "Charlie", 70000, 80000);
            emp3.assignDepartment("Engineering");

            employees.add(emp1);
            employees.add(emp2);
            employees.add(emp3);

            for (Employee emp : employees) {
                emp.displayDetails();
                System.out.println();
            }
        }
    }

