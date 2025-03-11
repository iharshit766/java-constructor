import java.util.*;

// Book class definition
class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + price);
    }
}

// Main class
public class BookDemo {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Book book1 = new Book();
        System.out.println("Book 1 Details (Default Constructor):");
        book1.display();
        System.out.println();

        // Creating an object using the parameterized constructor
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 499.99);
        System.out.println("Book 2 Details (Parameterized Constructor):");
        book2.display();
    }
}

/*
Input:
(No input required as values are hardcoded)

Output:
Book 1 Details (Default Constructor):
Title: Unknown
Author: Unknown
Price: Rs.0.0

Book 2 Details (Parameterized Constructor):
Title: The Alchemist
Author: Paulo Coelho
Price: Rs.499.99
*/
