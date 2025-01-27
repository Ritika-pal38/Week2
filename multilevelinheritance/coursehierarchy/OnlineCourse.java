package multilevelinheritance.coursehierarchy;

public class OnlineCourse extends Course {
    protected String platform;
    protected String isRecorded;

    public OnlineCourse(String courseName,int duration,String platform,String isRecorded){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Course platform : "+platform+" , Is course recorded :"+isRecorded);
    }
}
