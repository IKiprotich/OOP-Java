#include <iostream>
#include <string>
using namespace std;

class Employee {
private:
    string employeeName;
    int employeeId;
    double employeeSalary;

public:
    
    Employee() : employeeName("unknown"), employeeId(0), employeeSalary(0.00) {}

    Employee(const string& n, int id, double s) : employeeName(n), employeeId(id), employeeSalary(s) {}


    string getEmployeeName() const {
        return employeeName;
    }

    int getEmployeeId() const {
        return employeeId;
    }

    double getEmployeeSalary() const {
        return employeeSalary;
    }

    
    void setEmployeeName(const string& n) {
        employeeName = n;
    }

    void setEmployeeId(int id) {
        employeeId = id;
    }

    void setEmployeeSalary(double s) {
        employeeSalary = s;
    }

    // Method to raise salary
    double raiseSalary(double increment) {
        employeeSalary += increment;
        return employeeSalary;
    }
};

int main() {
    // Create an instance using no-args constructor
    Employee e1;
    e1.raiseSalary(5000.00);

    // Print out e1's details
    cout << "Employee ID: " << e1.getEmployeeId() << std::endl;
    cout << "Employee Name: " << e1.getEmployeeName() << std::endl;
    cout << "Employee Salary: " << e1.getEmployeeSalary() << std::endl;

    
    Employee e2("Nelson", 100, 20000.00);

    cout << "Employee Name: " << e2.getEmployeeName() << std::endl;
    cout << "Employee Salary: " << e2.getEmployeeSalary() << std::endl;

    // Using setters/mutators
    Employee e3;
    e3.setEmployeeName("John");
    e3.setEmployeeSalary(40000.00);
    e3.setEmployeeId(300);

    // Print e3's details
    cout << "Employee ID: " << e3.getEmployeeId() << std::endl;
    cout << "Employee Name: " << e3.getEmployeeName() << std::endl;
    cout << "Employee Salary: " << e3.getEmployeeSalary() << std::endl;

    return 0;
}
