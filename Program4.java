/*
 * Problem Statement: Implement BankAccount class with deposit, withdraw 
 * and balance inquiry.
 */

// Class representing a bank account
class BankAccount {
    // Variables to hold account details
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the account with starting values
    public BankAccount(String accNumber, String accHolder, double initialBalance) {
        this.accountNumber = accNumber;
        this.accountHolderName = accHolder;
        this.balance = initialBalance;
        System.out.println("Account created successfully for " + accountHolderName);
        System.out.println("Initial Balance: $" + initialBalance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Add amount to balance
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        // Check if amount is valid and if there is enough money in the balance
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Subtract amount from balance
            System.out.println("Successfully withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Withdrawal failed! Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method for balance inquiry
    public void displayBalance() {
        System.out.println("Current Balance for Account [" + accountNumber + "]: $" + balance);
    }
}

// Main class to run the program
public class Program4 {
    public static void main(String[] args) {
        System.out.println("=== Bank Operations System ===");
        
        // 1. Create a new Bank Account object
        BankAccount myAccount = new BankAccount("100200300", "John Doe", 500.00);
        System.out.println("------------------------------");

        // 2. Perform a deposit
        myAccount.deposit(200.00);
        myAccount.displayBalance();
        System.out.println("------------------------------");

        // 3. Perform a successful withdrawal
        myAccount.withdraw(150.00);
        myAccount.displayBalance();
        System.out.println("------------------------------");

        // 4. Attempt a withdrawal that is larger than the balance
        myAccount.withdraw(1000.00);
        myAccount.displayBalance();
        System.out.println("------------------------------");
    }
}