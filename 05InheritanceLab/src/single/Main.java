package single;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }

}
