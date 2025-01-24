
import java.util.ArrayList;
import java.util.List;

// Course Class
class Course {
    private String name;
    private Professor professor;
    private List<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public String toString() {
        return name + " (Professor: " + (professor != null ? professor.getName() : "None") + ")";
    }
}

// Student Class
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // Establish association
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Professor Class
class Professor {
    private String name;
    private List<Course> assignedCourses;

    public Professor(String name) {
        this.name = name;
        this.assignedCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        if (!assignedCourses.contains(course)) {
            assignedCourses.add(course);
            course.assignProfessor(this); // Establish association
        }
    }

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Main Class
public class UniversityManagement {
    public static void main(String[] args) {
        // Create Students
        Student student1 = new Student("John");
        Student student2 = new Student("Emma");

        // Create Professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Create Courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");

        // Assign Professors to Courses
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        // Enroll Students in Courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Display Courses, Professors, and Students
        System.out.println("Courses:");
        System.out.println(course1.getName() + " is taught by " + course1.getProfessor().getName() + ", Enrolled Students: " + course1.getEnrolledStudents());
        System.out.println(course2.getName() + " is taught by " + course2.getProfessor().getName() + ", Enrolled Students: " + course2.getEnrolledStudents());
    }
}

