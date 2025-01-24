import java.util.*;

// Patient Class
class Patient {
    private String name;
    private ArrayList<Doctor> consultedDoctors;

    public Patient(String name) {
        this.name = name;
        this.consultedDoctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Doctor> getConsultedDoctors() {
        return consultedDoctors;
    }

    public void addDoctor(Doctor doctor) {
        if (!consultedDoctors.contains(doctor)) {
            consultedDoctors.add(doctor);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}

// Doctor Class
class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public  ArrayList<Patient> getPatients() {
        return patients;
    }

    // Method to simulate consultation
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Establish association in both directions
        }
        System.out.println("Dr. " + name + " is consulting with Patient " + patient.getName());
    }

    @Override
    public String toString() {
        return name;
    }
}

// Hospital Class
class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
}

// Main Class
public class DoctorsAndPatients {
    public static void main(String[] args) {
        // Create a Hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create Doctors
        Doctor doctor1 = new Doctor("Alice");
        Doctor doctor2 = new Doctor("Bob");

        // Create Patients
        Patient patient1 = new Patient("John");
        Patient patient2 = new Patient("Emma");

        // Add Doctors and Patients to Hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Perform Consultations (Association and Communication)
        doctor1.consult(patient1); // Dr. Alice consults John
        doctor1.consult(patient2); // Dr. Alice consults Emma
        doctor2.consult(patient1); // Dr. Bob consults John

        // Display Consultations
        System.out.println("\nDoctor-Patient Relationships:");
        for (Doctor doctor : hospital.getDoctors()) {
            System.out.println("Dr. " + doctor.getName() + " is consulting: " + doctor.getPatients());
        }

        System.out.println("\nPatient-Doctor Relationships:");
        for (Patient patient : hospital.getPatients()) {
            System.out.println("Patient " + patient.getName() + " is consulting: " + patient.getConsultedDoctors());
        }
    }
}

