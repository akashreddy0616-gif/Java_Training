class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }

    // Transfer money between accounts
    public void transfer(BankAccount receiver, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Transferred $" + amount + " from " + accountHolder + " to " + receiver.accountHolder);
        } else {
            System.out.println("Transfer failed! Check balance or amount.");
        }
    }

    // Show account details
    public void showBalance() {
        System.out.println(accountHolder + "'s current balance: $" + balance);
    }
}

public class TransferTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1000);
        BankAccount acc2 = new BankAccount("Bob", 500);

        System.out.println("Before transfer:");
        acc1.showBalance();
        acc2.showBalance();

        System.out.println("\nTransferring $200 from Alice to Bob...");
        acc1.transfer(acc2, 200);

        System.out.println("\nAfter transfer:");
        acc1.showBalance();
        acc2.showBalance();
    }
}
