package assistedproblem.animalhierarchy;

public class Animal {
    protected String name ;
    protected int age ;

    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Name : "+name+"\n"+"Age : "+age);
    }
}
