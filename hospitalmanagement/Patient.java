package problemstatement.hospitalmanagement;
import java.util.*;

public abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis; // Encapsulated
    private List<String> medicalHistory; // Encapsulated

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.medicalHistory = new ArrayList<String>();
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis(){
        return diagnosis;
    }

    public List<String> getMedicalHistory(){
        return medicalHistory;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Diagnosis: " + diagnosis;
    }

}
