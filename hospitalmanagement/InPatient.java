package problemstatement.hospitalmanagement;
import java.util.*;

public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomChargesPerDay;

    public InPatient(int patientId, String name, int age, String diagnosis, int daysAdmitted, double roomChargesPerDay) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.roomChargesPerDay = roomChargesPerDay;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * roomChargesPerDay;
    }


    public void addRecord(String record) {
        getMedicalHistory().add(record);
    }


    public List<String> viewRecords() {
        return getMedicalHistory();
    }
}
