

public class Employee {
    
    //add a method named raise salary that 
    //accepts a parameter of type double named increment. The method should increase salary

    public double raiseSalary(double increment){
       
        employeeSalary = employeeSalary + increment;
        return employeeSalary;
    }

    

    // attributes
    private String employeeName;
    private int employeeId;
    private double employeeSalary;

    // no args constructor
    Employee() {
        employeeName = "unknown";
        employeeId = 0;
        employeeSalary = 0.00;
    }

    public Employee(String n, int id, double s) {
        employeeName = n;
        employeeId = id;
        employeeSalary = s;
    }

    // getter methods for each of the attributes
    public String getEmployeeName() {
        return employeeName;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    // setters
    public void setEmployeeName(String n) {
        employeeName = n;
    }
    
    public void setEmployeeId(int id) {
        employeeId = id;
    }
    
    public void setEmployeeSalary(double s) {
        employeeSalary = s;
    }
}