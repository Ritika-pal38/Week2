package problemstatement.hospitalmanagement;

public class HospitalManagement {
    public static void main(String[] args) {
        InPatient inPatient = new InPatient(1, "John Doe", 30, "Pneumonia", 5, 100.0);
        OutPatient outPatient = new OutPatient(2, "Jane Smith", 25, "Flu", 50.0, 20.0);

        System.out.println(inPatient.getPatientDetails());
        System.out.println("InPatient Bill: $" + inPatient.calculateBill());
        inPatient.addRecord("X-Ray taken");
        System.out.println("InPatient Medical Records: " + inPatient.viewRecords());

        System.out.println(outPatient.getPatientDetails());
        System.out.println("OutPatient Bill: $" + outPatient.calculateBill());
        outPatient.addRecord("Prescribed antibiotics");
        System.out.println("OutPatient Medical Records: " + outPatient.viewRecords());


        // Polymorphism example
        Patient patient1 = inPatient;
        Patient patient2 = outPatient;

        System.out.println("Polymorphism example:");
        System.out.println("Patient 1 Bill: $" + patient1.calculateBill());
        System.out.println("Patient 2 Bill: $" + patient2.calculateBill());
    }


}
