class Rectangle:
    # Constructor
    def __init__(self, length, width):
        self.length = length
        self.width = width

    # Setter methods
    def set_length(self, length):
        self.length = length

    def set_width(self, width):
        self.width = width

    # Getter methods
    def get_length(self):
        return self.length

    def get_width(self):
        return self.width

    # Method to compute the area
    def area_of_rect(self):
        return self.length * self.width

    # Method to compute the perimeter
    def find_perimeter(self):
        return 2 * (self.length + self.width)


# Main block
if __name__ == "__main__":
    # Instantiate the Rectangle class
    R1 = Rectangle(20, 30)
    R2 = Rectangle(30, 34)

    # Print the area using the instance method without parameters
    print("The Area is:", R2.area_of_rect())

    # Ask for user input to modify the rectangle's dimensions
    w = float(input("Enter the width: "))
    l = float(input("Enter the length: "))

    # Set the values using the setters
    R1.set_width(w)
    R1.set_length(l)

    # Output the updated values
    print("Updated width:", R1.get_width())
    print("Updated length:", R1.get_length())
    print("Updated Area:", R1.area_of_rect())
    print("Updated Perimeter:", R1.find_perimeter())