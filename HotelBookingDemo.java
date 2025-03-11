import java.util.*;
// HotelBooking class definition
class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

// Main class
public class HotelBookingDemo {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking 1 Details (Default Constructor):");
        booking1.display();
        System.out.println();

        // Creating an object using the parameterized constructor
        HotelBooking booking2 = new HotelBooking("Alice Johnson", "Deluxe", 3);
        System.out.println("Booking 2 Details (Parameterized Constructor):");
        booking2.display();
        System.out.println();

        // Creating an object using the copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Booking 3 Details (Copied from Booking 2):");
        booking3.display();
    }
}

/*
Input:
(No input required as values are hardcoded)

Output:
Booking 1 Details (Default Constructor):
Guest Name: Unknown
Room Type: Standard
Nights: 1

Booking 2 Details (Parameterized Constructor):
Guest Name: Alice Johnson
Room Type: Deluxe
Nights: 3

Booking 3 Details (Copied from Booking 2):
Guest Name: Alice Johnson
Room Type: Deluxe
Nights: 3
*/
