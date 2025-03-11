import java.util.*;

// BankAccount class definition
class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to get balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount subclass demonstrating access modifiers
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displaySavingsDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Accessing public member
        System.out.println("Account Holder: " + accountHolder); // Accessing protected member
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class
public class BankAccountManagement {
    public static void main(String[] args) {
        // Creating a bank account object
        BankAccount account1 = new BankAccount("123456789", "Rahul Sharma", 5000.0);
        account1.displayAccountDetails();
        account1.deposit(2000);
        account1.withdraw(1500);
        System.out.println();

        // Creating a savings account object
        SavingsAccount savings1 = new SavingsAccount("987654321", "Priya Verma", 10000.0, 5.0);
        savings1.displaySavingsDetails();
    }
}

/*
Input:
(No input required as values are hardcoded)

Output:
Account Number: 123456789
Account Holder: Rahul Sharma
Balance: 5000.0
Deposited: 2000.0
Withdrawn: 1500.0

Savings Account Details:
Account Number: 987654321
Account Holder: Priya Verma
Interest Rate: 5.0%
*/
