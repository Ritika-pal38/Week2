package hierarchicalinheritance.schoolsystem;

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ridhan", 38, "Mathematics");
        Student student = new Student("Riddima", 12, "6th garde");
        Staff staff = new Staff("Naksh", 45, "Management");


        teacher.displayDetails();
        teacher.displayRole();
        System.out.println("___________");



        student.displayDetails();
        student.displayRole();
        System.out.println("___________");


        staff.displayDetails();
        staff.displayRole();
    }
}
