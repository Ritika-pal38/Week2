package multilevelinheritance.coursehierarchy;

public class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName,int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails(){
        System.out.println("Course Details are : ");
        System.out.println(" Course name : "+courseName+",Course Duration : "+duration+"months");
    }
}
