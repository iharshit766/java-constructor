import java.util.*;

// Book class definition
class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// EBook subclass demonstrating access modifiers
class EBook extends Book {
    private double fileSize;

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display eBook details
    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN); // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main class
public class BookLibrarySystem {
    public static void main(String[] args) {
        // Creating a book object
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "James Gosling");
        book1.displayBookDetails();
        System.out.println();

        // Creating an eBook object
        EBook eBook1 = new EBook("978-0-321-35668-0", "Effective Java", "Joshua Bloch", 2.5);
        eBook1.displayEBookDetails();
    }
}

/*
Input:
(No input required as values are hardcoded)

Output:
ISBN: 978-3-16-148410-0
Title: Java Programming
Author: James Gosling

E-Book Details:
ISBN: 978-0-321-35668-0
Title: Effective Java
File Size: 2.5 MB
*/
