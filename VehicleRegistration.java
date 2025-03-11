import java.util.*;

// Vehicle class definition
class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000.0; // Class variable common for all vehicles

    // Default constructor
    public Vehicle() {
        this.ownerName = "Unknown";
        this.vehicleType = "Unknown";
    }

    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: Rs." + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

// Main class
public class VehicleRegistration {
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("Amit Kumar", "SUV");
        Vehicle vehicle2 = new Vehicle("Neha Singh", "Sedan");
        Vehicle vehicle3 = new Vehicle("Ravi Mehta", "Truck");

        // Displaying vehicle details before updating registration fee
        System.out.println("Before updating registration fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();
        vehicle3.displayVehicleDetails();
        System.out.println();

        // Updating registration fee
        Vehicle.updateRegistrationFee(7000.0);

        // Displaying vehicle details after updating registration fee
        System.out.println("After updating registration fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();
        vehicle3.displayVehicleDetails();
    }
}

/*
Input:
(No input required as values are hardcoded)

Output:
Before updating registration fee:
Owner Name: Amit Kumar
Vehicle Type: SUV
Registration Fee: Rs.5000.0

Owner Name: Neha Singh
Vehicle Type: Sedan
Registration Fee: Rs.5000.0

Owner Name: Ravi Mehta
Vehicle Type: Truck
Registration Fee: Rs.5000.0

After updating registration fee:
Owner Name: Amit Kumar
Vehicle Type: SUV
Registration Fee: Rs.7000.0

Owner Name: Neha Singh
Vehicle Type: Sedan
Registration Fee: Rs.7000.0

Owner Name: Ravi Mehta
Vehicle Type: Truck
Registration Fee: Rs.7000.0
*/
