// File: IterateAccounts.java
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

public class IterateAccounts {
    public static void main(String[] args) {

        // Create an array of Account objects
        Account[] accounts = new Account[3];

        // Initialize the accounts
        accounts[0] = new Account(101, "Alice", 5000.0);
        accounts[1] = new Account(102, "Bob", 3000.5);
        accounts[2] = new Account(103, "Charlie", 7000.75);

        // Iterate using a for loop and display account details
        System.out.println("--- Account Details ---");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Account " + (i + 1) + ":");
            accounts[i].displayAccount();
        }

        // Alternatively, you can use a for-each loop:
        /*
        for (Account acc : accounts) {
            acc.displayAccount();
        }
        */
    }
}
