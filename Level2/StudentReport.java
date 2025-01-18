class StudentReport {
    public static void main(String [] args){
        StudentDetail obj = new StudentDetail();
        obj.CalculateGrade(84);
        obj.displayDetails("Riya",78,84);
    }
}
class StudentDetail{
    public  String Name ;
    public int rollNumber;
    public int marks;
    public char grade;

    public void CalculateGrade(int marks){
        if(marks>80){
        grade = 'A';
        }
        else if(marks>60){
            grade = 'B';
        }
        else if(marks>40){
            grade = 'C';
        }

    }


    void displayDetails(String Name,int rollNumber,int marks){
        System.out.println("Student details are :");
        System.out.println("Name : "+Name+"\n"+"RollNumber : "+rollNumber+"\n"+"Marks : "+marks+"\n"+"Grade : "+grade);

    }
}


