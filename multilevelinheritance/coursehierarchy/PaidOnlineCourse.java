package multilevelinheritance.coursehierarchy;

public class PaidOnlineCourse extends OnlineCourse{
    protected int fee;
    protected float discount;

    public PaidOnlineCourse(String courseName,int duration,String platform,String isRecorded,int fee,float discount){
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Course fee : Rs"+fee+" , Discount : "+discount+"%");
    }
}
