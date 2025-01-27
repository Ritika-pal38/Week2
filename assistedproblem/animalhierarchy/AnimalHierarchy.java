package assistedproblem.animalhierarchy;

public class AnimalHierarchy {
    public static void main(String[] args){
        Animal animal = new Animal("Cow",9);
        animal.makeSound();

        Dog dog = new Dog("Jack",2);

        dog.makeSound();


        Cat cat = new Cat("Pushy",1);
        cat.makeSound();

        Bird bird = new Bird("Crip",1);
        bird.makeSound();
    }
}
