import java.util.*;

// Course class definition
class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Default Institute"; // Class variable common for all courses

    // Default constructor
    public Course() {
        this.courseName = "Unknown";
        this.duration = 0;
        this.fee = 0.0;
    }

    // Parameterized constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: Rs." + fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

// Main class
public class OnlineCourseManagement {
    public static void main(String[] args) {
        // Creating course objects
        Course course1 = new Course("Java Programming", 6, 15000.0);
        Course course2 = new Course("Web Development", 4, 12000.0);

        // Displaying course details before updating institute name
        System.out.println("Before updating institute name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        // Updating institute name
        Course.updateInstituteName("Tech Academy");

        // Displaying course details after updating institute name
        System.out.println("After updating institute name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}

/*
Input:
(No input required as values are hardcoded)

Output:
Before updating institute name:
Institute Name: Default Institute
Course Name: Java Programming
Duration: 6 months
Fee: Rs.15000.0

Institute Name: Default Institute
Course Name: Web Development
Duration: 4 months
Fee: Rs.12000.0

After updating institute name:
Institute Name: Tech Academy
Course Name: Java Programming
Duration: 6 months
Fee: Rs.15000.0

Institute Name: Tech Academy
Course Name: Web Development
Duration: 4 months
Fee: Rs.12000.0
*/
