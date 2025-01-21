public class HospitalManagementSystem {

    public static void main(String[] args) {
        Patient obj = new Patient("Ritika",21,"Migraine",112);
        obj.getTotalPatients();
        obj.printDetails();

    }
}
class Patient{

    public static String hospitalName = "Bansal Hospital";
    protected static int totalPatient = 0;
    protected String ailment;
    protected int age;
    protected String PatientName;
    private final int ID;

    Patient(String name,int age,String disease,int ID){
        this.PatientName = name;
        this.age = age;
        this.ailment = disease;
        this.ID = ID;
        totalPatient++;
    }
    public static void getTotalPatients(){
        System.out.println("Total number of patients"+totalPatient);
    }
    public void printDetails(){
        if(this instanceof Patient){
            System.out.println("this is an instance of Patient class");
            System.out.println("Hospital name : "+hospitalName);
            System.out.println("Patient details are : ");
            System.out.println("Patient name : "+PatientName+"\n"+"Patient ID : "+ID+"\n"+"Patient age : "+age+"\n"+"Patient ailment : "+ailment);
        }
        
    }

}
