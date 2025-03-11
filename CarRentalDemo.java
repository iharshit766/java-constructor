import java.util.*;

// CarRental class definition
class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0; // Assuming a fixed daily rental rate

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Copy constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    // Method to display rental details
    public void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: Rs." + calculateTotalCost());
    }
}

// Main class
public class CarRentalDemo {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        CarRental rental1 = new CarRental();
        System.out.println("Rental 1 Details (Default Constructor):");
        rental1.display();
        System.out.println();

        // Creating an object using the parameterized constructor
        CarRental rental2 = new CarRental("John Doe", "SUV", 5);
        System.out.println("Rental 2 Details (Parameterized Constructor):");
        rental2.display();
        System.out.println();

        // Creating an object using the copy constructor
        CarRental rental3 = new CarRental(rental2);
        System.out.println("Rental 3 Details (Copied from Rental 2):");
        rental3.display();
    }
}

/*
Input:
(No input required as values are hardcoded)

Output:
Rental 1 Details (Default Constructor):
Customer Name: Unknown
Car Model: Standard
Rental Days: 1
Total Cost: Rs.50.0

Rental 2 Details (Parameterized Constructor):
Customer Name: John Doe
Car Model: SUV
Rental Days: 5
Total Cost: Rs.250.0

Rental 3 Details (Copied from Rental 2):
Customer Name: John Doe
Car Model: SUV
Rental Days: 5
Total Cost: Rs.250.0
*/
