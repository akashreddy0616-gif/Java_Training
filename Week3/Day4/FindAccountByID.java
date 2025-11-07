// File: FindAccountByID.java
import java.util.*;

class Account {
    int accNo;
    String accHolder;
    double balance;

    // Constructor
    Account(int accNo, String accHolder, double balance) {
        this.accNo = accNo;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    // Method to display account details
    void displayAccount() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Balance: $" + balance);
    }
}

public class FindAccountByID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of Account objects
        Account[] accounts = new Account[3];
        accounts[0] = new Account(101, "Alice", 5000.0);
        accounts[1] = new Account(102, "Bob", 3000.5);
        accounts[2] = new Account(103, "Charlie", 7000.75);

        // Ask user for account ID to search
        System.out.print("Enter Account ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        // Search using loop
        for (Account acc : accounts) {
            if (acc.accNo == searchId) {
                System.out.println("\nAccount Found:");
                acc.displayAccount();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nAccount not found!");
        }

        sc.close();
    }
}
