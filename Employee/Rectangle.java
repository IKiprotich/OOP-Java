import java.util.Scanner;

public class Rectangle {
    // include 2 attributes named width and length
    double width; 
    double length;

    // constructor
    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    // setter methods
    public void setLength(double l) {
        this.length = l;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    // getter methods
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    // method that computes the area
    public double areaOfRect() {
        return this.length * this.width;
    }

    // method to compute perimeter
    public double findPerimeter() {
        return 2 * (this.length + this.width);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // instantiate the rectangle class
        Rectangle R1 = new Rectangle(20, 30);
        Rectangle R2 = new Rectangle(30, 34);

        // print the area using the instance method without parameters
        System.out.println("The Area is: " + R2.areaOfRect());

        // ask for user input to modify the rectangle's dimensions
        System.out.println("Enter the width: ");
        double w = input.nextDouble();

        System.out.println("Enter the length: ");
        double l = input.nextDouble();

        // set the values using the setters
        R1.setWidth(w);
        R1.setLength(l);

        // output the updated values
        System.out.println("Updated width: " + R1.getWidth());
        System.out.println("Updated length: " + R1.getLength());
        System.out.println("Updated Area: " + R1.areaOfRect());
        System.out.println("Updated Perimeter: " + R1.findPerimeter());

        input.close();
    }
}