// File: BankTransaction.java
import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        double balance = 500.00; // initial balance
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds! Your balance is only $" + balance);
            }

            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: $" + balance);
        } 
        catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } 
        finally {
            System.out.println("Transaction completed. Thank you for banking with us!");
            sc.close();
        }
    }
}
