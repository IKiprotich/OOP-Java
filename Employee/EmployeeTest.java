public class EmployeeTest {

    public static void main(String[] args) {
        // Create an instance without args constructor
        Employee e1 = new Employee();

        e1.raiseSalary(5000.00);

        // Print out e1's details
        System.out.println("Employee ID: " + e1.getEmployeeId());
        System.out.println("Employee Name: " + e1.getEmployeeName());
        System.out.println("Employee Salary: " + e1.getEmployeeSalary());

        // Create an instance with constructor with arguments
        Employee e2 = new Employee("Nelson", 100, 20000.00);

        // print statements for e2
        System.out.println("Employee ID: " + e2.getEmployeeId());
        System.out.println("Employee Name: " + e2.getEmployeeName());
        System.out.println("Employee Salary: " + e2.getEmployeeSalary());

        // use setters/mutators
        Employee e3 = new Employee();
        e3.setEmployeeName("John");
        e3.setEmployeeSalary(40000.00);
        e3.setEmployeeId(300);

        //print e3's details
        System.out.println("Employee ID: " + e3.getEmployeeId());
        System.out.println("Employee Name: " + e3.getEmployeeName());
        System.out.println("Employee Salary: " + e3.getEmployeeSalary());
    }
}