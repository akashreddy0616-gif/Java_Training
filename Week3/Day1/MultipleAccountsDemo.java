// MultipleAccountsDemo.java
class Account {
    private String accountHolder;
    private double balance;

    // Constructor
    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolder + " deposited $" + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance for " + accountHolder);
        }
    }

    // Display balance method
    public void displayBalance() {
        System.out.println(accountHolder + "'s current balance: $" + balance);
    }
}

public class MultipleAccountsDemo {
    public static void main(String[] args) {
        // Creating multiple Account objects
        Account acc1 = new Account("Alice", 1000);
        Account acc2 = new Account("Bob", 500);
        Account acc3 = new Account("Charlie", 1500);

        // Performing some transactions
        acc1.deposit(200);
        acc2.withdraw(100);
        acc3.deposit(300);

        // Displaying balances
        acc1.displayBalance();
        acc2.displayBalance();
        acc3.displayBalance();
    }
}
