
import java.util.*;

// Department Class (Part of the University via Composition)
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Faculty Class (Aggregated in University)
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// University Class
class University {
    private String name;
    private ArrayList<Department> departments; // Composition
    private ArrayList<Faculty> faculties; // Aggregation

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Add a Department to the University
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Add a Faculty to the University
    public void addFaculty(Faculty faculty) {
        if (!faculties.contains(faculty)) {
            faculties.add(faculty);
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    // Deleting the University deletes all its Departments (Composition)
    public void deleteUniversity() {
        System.out.println("Deleting university: " + name);
        System.out.println("Deleting all departments...");
        departments.clear();
    }
}

// Main Class to Demonstrate Functionality
public class FacultiesDepartments {
    public static void main(String[] args) {
        // Create University
        University university = new University("RGPV University");

        // Add Departments (Composition)
        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");
        university.addDepartment("Electrical Engineering");

        // Create Faculty Members
        Faculty faculty1 = new Faculty("Dr. Sahab");
        Faculty faculty2 = new Faculty("Dr. Jiya");
        Faculty faculty3 = new Faculty("Dr. Herry");

        // Add Faculty Members to the University (Aggregation)
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Display Departments and Faculty
        System.out.println("University: " + university.getName());
        System.out.println("Departments: " + university.getDepartments());
        System.out.println("Faculties: " + university.getFaculties());

        // Delete University (Demonstrating Composition)
        university.deleteUniversity();
        System.out.println("Departments after deleting university: " + university.getDepartments());

        // Faculty Members still exist independently (Aggregation)
        System.out.println("Faculty Members after deleting university: " + faculty1 + ", " + faculty2 + ", " + faculty3);
    }
}

