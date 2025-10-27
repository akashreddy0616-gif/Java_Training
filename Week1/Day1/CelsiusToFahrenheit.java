import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Formula: F = (C * 9/5) + 32
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        scanner.close();
    }
}
