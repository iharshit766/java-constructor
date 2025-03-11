import java.util.*;

// Circle class definition
class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calling parameterized constructor with default value
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display circle details
    public void display() {
        System.out.println("Radius: " + radius);
    }
}

// Main class
public class CircleDemo {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Circle circle1 = new Circle();
        System.out.println("Circle 1 Details (Default Constructor):");
        circle1.display();
        System.out.println();

        // Creating an object using the parameterized constructor
        Circle circle2 = new Circle(5.5);
        System.out.println("Circle 2 Details (Parameterized Constructor):");
        circle2.display();
    }
}

/*
Input:
(No input required as values are hardcoded)

Output:
Circle 1 Details (Default Constructor):
Radius: 1.0

Circle 2 Details (Parameterized Constructor):
Radius: 5.5
*/
