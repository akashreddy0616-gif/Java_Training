class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private String accountType;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, String accountType, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to display all account details
    public void displayAccountDetails() {
        System.out.println("===== Account Details =====");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Current Balance: $" + balance);
        System.out.println("===========================\n");
    }
}

public class PrintAccountDetails {
    public static void main(String[] args) {
        // Create few sample accounts
        BankAccount acc1 = new BankAccount("Alice Johnson", "ACC12345", "Savings", 1200.50);
        BankAccount acc2 = new BankAccount("Bob Williams", "ACC67890", "Checking", 850.75);
        BankAccount acc3 = new BankAccount("Charlie Smith", "ACC54321", "Savings", 2300.00);

        // Display all account details
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        acc3.displayAccountDetails();
    }
}
