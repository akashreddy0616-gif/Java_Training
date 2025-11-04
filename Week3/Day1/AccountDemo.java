// File: AccountDemo.java

class Account {
    private String accountHolder;
    private double balance;

    // Constructor
    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display account details
    public void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Main class to test Account
public class AccountDemo {
    public static void main(String[] args) {
        // Create an account object
        Account myAccount = new Account("Alice", 1000);

        // Display initial details
        myAccount.display();

        // Deposit money
        myAccount.deposit(500);

        // Withdraw money
        myAccount.withdraw(300);

        // Try withdrawing more than balance
        myAccount.withdraw(1500);

        // Display final details
        myAccount.display();
    }
}
