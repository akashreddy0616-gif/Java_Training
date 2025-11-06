// File: TestExceptionHandling.java
import java.util.Scanner;

public class TestExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Scenario 1: Division by zero
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();
            System.out.print("Enter denominator: ");
            int den = sc.nextInt();
            int result = num / den;
            System.out.println("Result: " + result);

            // Scenario 2: Array index out of bounds
            int[] numbers = {10, 20, 30};
            System.out.print("Enter array index (0-2): ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);

            // Scenario 3: Number format exception
            sc.nextLine(); // clear buffer
            System.out.print("Enter a number (or text to trigger error): ");
            String input = sc.nextLine();
            int parsed = Integer.parseInt(input);
            System.out.println("You entered number: " + parsed);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of range!");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        } 
        catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } 
        finally {
            System.out.println("Error simulation complete. Program finished.");
            sc.close();
        }
    }
}
