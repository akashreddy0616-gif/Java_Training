import java.util.Scanner;

public class TextBasedCalculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }

    // Method for power
    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    // Method to reverse a number
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;

            do {
                // Display menu
                System.out.println("\n=== Text-Based Calculator ===");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Power");
                System.out.println("6. Reverse Number");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter two numbers: ");
                        double a1 = sc.nextDouble();
                        double b1 = sc.nextDouble();
                        System.out.println("Result: " + add(a1, b1));
                    }
                    case 2 -> {
                        System.out.print("Enter two numbers: ");
                        double a2 = sc.nextDouble();
                        double b2 = sc.nextDouble();
                        System.out.println("Result: " + subtract(a2, b2));
                    }
                    case 3 -> {
                        System.out.print("Enter two numbers: ");
                        double a3 = sc.nextDouble();
                        double b3 = sc.nextDouble();
                        System.out.println("Result: " + multiply(a3, b3));
                    }
                    case 4 -> {
                        System.out.print("Enter two numbers: ");
                        double a4 = sc.nextDouble();
                        double b4 = sc.nextDouble();
                        System.out.println("Result: " + divide(a4, b4));
                    }
                    case 5 -> {
                        System.out.print("Enter base and exponent: ");
                        double base = sc.nextDouble();
                        double exponent = sc.nextDouble();
                        System.out.println("Result: " + power(base, exponent));
                    }
                    case 6 -> {
                        System.out.print("Enter an integer: ");
                        int num = sc.nextInt();
                        System.out.println("Reversed Number: " + reverseNumber(num));
                    }
                    case 0 -> System.out.println("Exiting calculator. Goodbye!");
                    default -> System.out.println("Invalid choice! Please try again.");
                }

            } while (choice != 0);

            sc.close();
        }
    }
}
