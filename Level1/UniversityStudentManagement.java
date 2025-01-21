class Student{
    private static String universityName = "RGPV";
    protected static int totalStudents = 0;
    public String name ;
    public final int rollNumber;
    protected char Grade;

    Student(String name,int rollNumber,char grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.Grade = grade;
         totalStudents++;

   }
   public void displayDetails(){
    if(this instanceof Student){
        System.out.println("this is an instance of Student class");
        System.out.println("Student Details are : ");
        System.out.println("University Name : "+universityName+"\n"+"Student Name : "+name+"\n"+"Roll number : "+rollNumber+"\n"+"Grade : "+Grade);

    }
    else{
        System.out.println("this is not an instance of Student class");
    }
   }
   public static void displayTotalStudents(){
    System.out.println("The total number of students enrolled are : "+totalStudents);
   }
      
}
public class UniversityStudentManagement {
  public static void main(String[]args){
    Student obj = new Student("Karan",112,'A');
    obj.displayTotalStudents();
    obj.displayDetails();
  }
}
