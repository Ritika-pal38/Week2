package hybridinheritance.restaurent;

public class Person {
    protected String name;
    protected int id;

    public Person(String name,int id){
        this.name = name;
        this.id = id;
    }

    public void showDetails(){
        System.out.println("Name : "+name+"\n"+"Id : "+id);
    }

}
