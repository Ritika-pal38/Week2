package assistedproblem.animalhierarchy;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Cat meaws !");
    }
}
