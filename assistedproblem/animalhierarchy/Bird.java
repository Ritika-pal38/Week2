package assistedproblem.animalhierarchy;

public class Bird extends Animal{

    public Bird(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Bird chirps!");
    }
}
