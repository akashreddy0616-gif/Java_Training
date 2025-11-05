class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println(accountHolder + "'s Balance: $" + balance);
    }

    // Method to transfer money (checks balance first)
    public void transferMoney(BankAccount receiver, double amount) {
        System.out.println("\nAttempting to transfer $" + amount + " from " + accountHolder + " to " + receiver.accountHolder);

        if (amount <= 0) {
            System.out.println("❌ Invalid amount! Enter a positive number.");
        } else if (amount > balance) {
            System.out.println("❌ Transfer failed! Insufficient funds.");
        } else {
            balance -= amount;
            receiver.balance += amount;
            System.out.println("✅ Transfer successful!");
        }
    }
}

public class CheckBalanceBeforeTransfer {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 500);
        BankAccount acc2 = new BankAccount("Bob", 300);

        System.out.println("Before Transfer:");
        acc1.displayBalance();
        acc2.displayBalance();

        // Try transferring money
        acc1.transferMoney(acc2, 200);

        System.out.println("\nAfter Transfer:");
        acc1.displayBalance();
        acc2.displayBalance();

        // Try transferring more than available
        acc1.transferMoney(acc2, 400);
    }
}
