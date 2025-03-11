import java.util.*;

// Product class definition
class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0; // Class variable to track total products

    // Default constructor
    public Product() {
        this.productName = "Unknown";
        this.price = 0.0;
        totalProducts++;
    }

    // Parameterized constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products count
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs." + price);
    }

    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

// Main class
public class ProductInventory {
    public static void main(String[] args) {
        // Creating product objects
        Product product1 = new Product("Laptop", 55000.0);
        Product product2 = new Product("Smartphone", 20000.0);
        Product product3 = new Product(); // Default constructor usage

        // Displaying product details
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();
        System.out.println();

        System.out.println("Product 2 Details:");
        product2.displayProductDetails();
        System.out.println();

        System.out.println("Product 3 Details (Default Constructor):");
        product3.displayProductDetails();
        System.out.println();

        // Displaying total products created
        Product.displayTotalProducts();
    }
}

/*
Input:
(No input required as values are hardcoded)

Output:
Product 1 Details:
Product Name: Laptop
Price: Rs.55000.0

Product 2 Details:
Product Name: Smartphone
Price: Rs.20000.0

Product 3 Details (Default Constructor):
Product Name: Unknown
Price: Rs.0.0

Total Products Created: 3
*/
