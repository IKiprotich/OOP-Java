public class Circle {
    
    private double radius = 0;
    private static final double PI = 3.14159;

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Default constructor
    public Circle() {
    }

    public double findArea() {
        return PI * radius * radius; // Use instance variable
    }

    public double findCircumference() {
        return 2 * PI * radius; // Use instance variable
    }
}
