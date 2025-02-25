// No instances can be created for abstract classes
// Abstract classes can have abstract methods
// Abstract methods are methods without a body
// Abstract methods must be implemented by the subclass
// Abstract classes can have concrete methods
// Concrete methods are methods with a body
abstract class Shape {

// Abstract class can have abstract methods
    public abstract void someMethod();
    public abstract void someOtherMethod();
   
}


class someClass extends Shape {
    
    //subclasses must implement the abstract methods
    @Override// This is optional but it is a good practice to use it
    public void someMethod() {}
    public void someOtherMethod() {}
}

class ClientClass {
    public static void main(String[] args) {
        // Shape s = new Shape(); // Error because Shape is abstract and cannot be instantiated
    }
}