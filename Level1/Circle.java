

class Circle{
      public int radius;

      double circumferenceCircle;
      double areaCircle;

      Circle(int r){
            this.radius = r;
            circumferenceCircle = 2*3.17*r;
            areaCircle = 3.17*r*r;
      }

      void display_result(){
            System.out.println("Circumference of circle : "+ circumferenceCircle );
            System.out.println("Area of circle : "+areaCircle);
      }

}
class Circle_Details{
      public static void main(String [] args){
            Circle obj = new Circle(10);
            obj.display_result();




      }
}