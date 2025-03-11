import java.util.*;

// Student class definition
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Method to set CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// PostgraduateStudent subclass demonstrating use of protected member
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        displayStudentDetails(); // Accessing protected member "name"
        System.out.println("Specialization: " + specialization);
    }
}

// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating a student object
        Student student1 = new Student(101, "Rahul Sharma", 8.5);
        student1.displayStudentDetails();
        System.out.println();

        // Creating a postgraduate student object
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Priya Verma", 9.0, "Computer Science");
        pgStudent.displayPostgraduateDetails();
    }
}

/*
Input:
(No input required as values are hardcoded)

Output:
Roll Number: 101
Name: Rahul Sharma
CGPA: 8.5

Roll Number: 102
Name: Priya Verma
CGPA: 9.0
Specialization: Computer Science
*/
