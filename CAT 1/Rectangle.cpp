#include <iostream>
using namespace std;

class Rectangle {
private:
    // Attributes
    double width;
    double length;

public:
    // Constructor
    Rectangle(double l, double w) : length(l), width(w) {}

    // Setter methods
    void setLength(double l) {
        length = l;
    }

    void setWidth(double w) {
        width = w;
    }

    // Getter methods
    double getLength() const {
        return length;
    }

    double getWidth() const {
        return width;
    }

    // Method to compute area
    double areaOfRect() const {
        return length * width;
    }

    // Method to compute perimeter
    double findPerimeter() const {
        return 2 * (length + width);
    }
};

int main() {
    // Instantiate the Rectangle class
    Rectangle R1(20, 30);
    Rectangle R2(30, 34);

    // Print the area using the instance method without parameters
    cout << "The Area is: " << R2.areaOfRect() << endl;

    // Ask for user input to modify the rectangle's dimensions
    double w, l;
    cout << "Enter the width: ";
    cin >> w;

    cout << "Enter the length: ";
    cin >> l;

    // Set the values using the setters
    R1.setWidth(w);
    R1.setLength(l);

    // Output the updated values
    cout << "Updated width: " << R1.getWidth() << endl;
    cout << "Updated length: " << R1.getLength() << endl;
    cout << "Updated Area: " << R1.areaOfRect() << endl;
    cout << "Updated Perimeter: " << R1.findPerimeter() << endl;

    return 0;
}