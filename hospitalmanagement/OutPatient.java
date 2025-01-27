package problemstatement.hospitalmanagement;
import java.util.*;

public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private double medicineCost;

    public OutPatient(int patientId, String name, int age, String diagnosis, double consultationFee, double medicineCost) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
        this.medicineCost = medicineCost;
    }

    @Override
    public double calculateBill() {
        return consultationFee + medicineCost;
    }


    public void addRecord(String record) {
        getMedicalHistory().add(record);
    }


    public List<String> viewRecords() {
        return getMedicalHistory();
    }

}
