import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Test Program ===");
            System.out.println("1. Find Factorial");
            System.out.println("2. Check Palindrome");
            System.out.println("3. Reverse Number");
            System.out.println("4. Check Even or Odd");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    int fact = 1;
                    for (int i = 1; i <= n; i++) {
                        fact *= i;
                    }
                    System.out.println("Factorial = " + fact);
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    int temp = num, rev = 0;
                    while (num > 0) {
                        rev = rev * 10 + num % 10;
                        num /= 10;
                    }
                    if (rev == temp)
                        System.out.println("Palindrome Number");
                    else
                        System.out.println("Not a Palindrome");
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int num2 = sc.nextInt();
                    int reverse = 0;
                    while (num2 > 0) {
                        reverse = reverse * 10 + num2 % 10;
                        num2 /= 10;
                    }
                    System.out.println("Reversed Number = " + reverse);
                    break;

                case 4:
                    System.out.print("Enter a number: ");
                    int num3 = sc.nextInt();
                    if (num3 % 2 == 0)
                        System.out.println("Even Number");
                    else
                        System.out.println("Odd Number");
                    break;

                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}