// File: InvalidOperationDemo.java
import java.util.Scanner;

// Custom exception class
class InvalidOperationException extends Exception {
    public InvalidOperationException(String message) {
        super(message);
    }
}

public class InvalidOperationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Choose operation: add / subtract / divide");
            String operation = sc.nextLine().toLowerCase();

            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = 0;

            switch (operation) {
                case "add":
                    result = a + b;
                    break;
                case "subtract":
                    result = a - b;
                    break;
                case "divide":
                    if (b == 0) {
                        throw new InvalidOperationException("Division by zero is not allowed!");
                    }
                    result = a / b;
                    break;
                default:
                    throw new InvalidOperationException("Invalid operation! Please choose add, subtract, or divide.");
            }

            System.out.println("Result: " + result);
        } 
        catch (InvalidOperationException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } 
        finally {
            System.out.println("Operation attempt completed.");
            sc.close();
        }
    }
}
