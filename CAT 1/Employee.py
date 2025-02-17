class Employee:
    def __init__(self, name="unknown", emp_id=0, salary=0.00):
        self.employee_name = name
        self.employee_id = emp_id
        self.employee_salary = salary

    # Getter methods
    def get_employee_name(self):
        return self.employee_name

    def get_employee_id(self):
        return self.employee_id

    def get_employee_salary(self):
        return self.employee_salary

    # Setter methods
    def set_employee_name(self, name):
        self.employee_name = name

    def set_employee_id(self, emp_id):
        self.employee_id = emp_id

    def set_employee_salary(self, salary):
        self.employee_salary = salary

    # Method to raise salary
    def raise_salary(self, increment):
        self.employee_salary += increment
        return self.employee_salary


# Test cases
if __name__ == "__main__":
    # Create an instance using no-args constructor
    e1 = Employee()
    e1.raise_salary(5000.00)

    # Print out e1's details
    print("Employee ID:", e1.get_employee_id())
    print("Employee Name:", e1.get_employee_name())
    print("Employee Salary:", e1.get_employee_salary())

    # Create an instance using parameterized constructor
    e2 = Employee("Nelson", 100, 20000.00)

    # Print out e2's details
    print("Employee ID:", e2.get_employee_id())
    print("Employee Name:", e2.get_employee_name())
    print("Employee Salary:", e2.get_employee_salary())

    # Use setters/mutators
    e3 = Employee()
    e3.set_employee_name("John")
    e3.set_employee_salary(40000.00)
    e3.set_employee_id(300)

    # Print e3's details
    print("Employee ID:", e3.get_employee_id())
    print("Employee Name:", e3.get_employee_name())
    print("Employee Salary:", e3.get_employee_salary())