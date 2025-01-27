package hybridinheritance.restaurent;

public class Chef extends Person implements Worker{

    public Chef(String name , int id){
        super(name, id);
    }


    @Override
    public void performDuties(){

        System.out.println("This person is a chef");
    }
}
