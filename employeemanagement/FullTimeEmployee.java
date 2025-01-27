package problemstatement.employeemanagement;
public class FullTimeEmployee extends Employee implements Department{
    private double monthlySalary;
    private String departmentName;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double monthlySalary) {
        super(employeeId, name, baseSalary);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
        super.setDepartment(departmentName);
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}


