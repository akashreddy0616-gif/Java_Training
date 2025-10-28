import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N (number of even numbers to sum): ");
        int n = scanner.nextInt();

        int sum = 0;

        // Loop through first N even numbers: 2, 4, 6, ...
        for (int i = 1; i <= n; i++) {
            sum += 2 * i;
        }

        System.out.println("Sum of first " + n + " even numbers is: " + sum);
        scanner.close();
    }
}
