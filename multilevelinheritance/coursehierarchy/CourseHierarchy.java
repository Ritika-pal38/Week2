package multilevelinheritance.coursehierarchy;

public class CourseHierarchy {
    public static void main(String[] args) {
        Course alpha = new Course("delta",6);
        OnlineCourse delta2 = new OnlineCourse("delta",6,"apnacollege,com","Yes");
        PaidOnlineCourse alpha2 = new PaidOnlineCourse("delta2.0",12,"apnacollege.com","Yes",4500,12);
        System.out.println("Class Course details are : ");
        alpha.displayDetails();
        System.out.println("Class OnlineCourse details are : ");
        delta2.displayDetails();
        System.out.println("Class PaidCourse details are : ");
        alpha2.displayDetails();
    }
}
