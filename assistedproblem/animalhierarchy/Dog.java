package assistedproblem.animalhierarchy;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Dog barks !");
    }
}
