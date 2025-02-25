abstract class Animal {
    String name = "Unknown"; // This is a concrete field
    
    //cocnrete method - this is a method with a body
    void eat () {
        System.out.println(name + " is eating");
    }

    //abstract method - this is a method without a body
    abstract void makeSound();
}


class Dog extends Animal {
    //must implement the abstract method
    void makeSound() {
        System.out.println(name + "barks");
    }
}


//main class
public class Main {
    public static void main(String[] args) {
        //animal a = new Animal(); // Error because Animal is abstract and cannot be instantiated
        Dog dog = new Dog();
        dog.name = "Rover";
        dog.makeSound();
        dog.eat();
    }
}


