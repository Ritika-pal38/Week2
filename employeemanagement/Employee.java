package problemstatement.employeemanagement;

abstract class Employee {

        private int employeeId;
        private String name;
        private double baseSalary;
        private String department;

        public Employee(int employeeId, String name, double baseSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.baseSalary = baseSalary;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public String getName() {
            return name;
        }

        public double getBaseSalary() {
            return baseSalary;
        }

        public String getDepartment(){
            return department;
        }

        public void setDepartment(String department){
            this.department = department;
        }

        abstract double calculateSalary();

        public void displayDetails() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + name);
            System.out.println("Base Salary: " + baseSalary);
            System.out.println("Department: " + department);
            System.out.println("Calculated Salary: " + calculateSalary());
        }
    }




