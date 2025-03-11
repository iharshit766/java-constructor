import java.util.*;

// Person class definition
class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class PersonDemo {
    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Person person1 = new Person("John Doe", 30);
        System.out.println("Person 1 Details:");
        person1.display();
        System.out.println();

        // Creating an object using the copy constructor
        Person person2 = new Person(person1);
        System.out.println("Person 2 Details (Copied from Person 1):");
        person2.display();
    }
}

/*
Input:
(No input required as values are hardcoded)

Output:
Person 1 Details:
Name: John Doe
Age: 30

Person 2 Details (Copied from Person 1):
Name: John Doe
Age: 30
*/
