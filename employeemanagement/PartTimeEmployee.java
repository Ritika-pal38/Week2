package problemstatement.employeemanagement;


public  class PartTimeEmployee extends Employee implements Department{
        private int hoursWorked;
        private double hourlyRate;
        private String departmentName;

        public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
            super(employeeId, name, baseSalary);
            this.hoursWorked = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        double calculateSalary() {
            return hoursWorked * hourlyRate;
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

