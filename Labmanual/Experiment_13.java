// Abstract class
abstract class Animal {
    // Abstract method
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Interface
interface Pet {
    void play();
}

// Concrete class extending abstract class and implementing interface
class Dog extends Animal implements Pet {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}

public class Experiment_13 {
     public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // from abstract class
        d.eat();   // from abstract class (concrete method)
        d.play();  // from interface
    }    
}
