 class PhoneDetails {
    public static void main(String [] args){
        MobilePhone obj = new MobilePhone();
        obj.displayDetails("Realme","P1 5g",1600);
    }
}
 class MobilePhone{
   public  String Brand ;
   public String Model;
   public int Price;

    void displayDetails(String Brand,String Model,int Price){
        System.out.println("Mobile phone details are :");
        System.out.println("Brand : "+Brand+"\n"+"Model : "+Model+"\n"+"Price : "+Price);

    }
}
