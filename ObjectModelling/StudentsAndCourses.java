import java.util.ArrayList;
import java.util.*;

// Course Class
class Course {
    private String name;
    ArrayList <Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Student Class
class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // Establish the association
        }
    }

    public ArrayList<Course> getCourses() {
        return courses;

    }

    @Override
    public String toString() {
        return name;
    }
}

// School Class
class School {
    private String name;
    private ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}

// Main Class to demonstrate functionality
public class StudentsAndCourses {
    public static void main(String[] args) {
        // Create School
        School school = new School("Government School");

        // Create Students
        Student student1 = new Student("Karan");
        Student student2 = new Student("Gagan");

        // Create Courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Add Students to School (Aggregation)
        school.addStudent(student1);
        school.addStudent(student2);

        // Enroll Students in Courses (Association)
        student1.enrollInCourse(math);
        student1.enrollInCourse(science);

        student2.enrollInCourse(math);

        // Display Courses for each Student
        for (Student student : school.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Enrolled Courses: " + student.getCourses());
        }

        // Display Students in each Course
        System.out.println("\nCourse Enrollments:");
        for (Course course : List.of(math, science)) {
            System.out.println("Course: " + course.getName());
            System.out.println("Enrolled Students: " + course.getEnrolledStudents());
        }
    }
}


