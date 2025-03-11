import java.util.*;

// Employee class definition
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to get salary
    public double getSalary() {
        return salary;
    }

    // Method to update salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated to: " + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Manager subclass demonstrating access modifiers
class Manager extends Employee {
    private String teamSize;

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Accessing public member
        System.out.println("Department: " + department); // Accessing protected member
        System.out.println("Team Size: " + teamSize);
    }
}

// Main class
public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an employee object
        Employee emp1 = new Employee(101, "IT", 50000.0);
        emp1.displayEmployeeDetails();
        emp1.setSalary(55000.0);
        System.out.println();

        // Creating a manager object
        Manager mgr1 = new Manager(201, "HR", 75000.0, "10 Members");
        mgr1.displayManagerDetails();
    }
}

/*
Input:
(No input required as values are hardcoded)

Output:
Employee ID: 101
Department: IT
Salary: 50000.0
Salary updated to: 55000.0

Manager Details:
Employee ID: 201
Department: HR
Team Size: 10 Members
*/
