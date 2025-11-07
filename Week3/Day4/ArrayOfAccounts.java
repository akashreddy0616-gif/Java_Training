// File: ArrayOfAccounts.java
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
        System.out.println("---------------------------");
    }
}

public class ArrayOfAccounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Create an array of Account objects
        Account[] accounts = new Account[n];

        // Input account details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Account " + (i + 1) + ":");
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Account Holder Name: ");
            String accHolder = sc.nextLine();

            System.out.print("Enter Balance: ");
            double balance = sc.nextDouble();

            // Store account in array
            accounts[i] = new Account(accNo, accHolder, balance);
        }

        // Display all accounts
        System.out.println("\n--- Account Details ---");
        for (Account acc : accounts) {
            acc.displayAccount();
        }

        sc.close();
    }
}
