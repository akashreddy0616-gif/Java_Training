import java.util.Scanner;

// Week1/Day4 - Shape class with constructor & method overloading + menu input
class Shape {
    double length, width, radius;

    // Default constructor
    Shape() {
        length = 0;
        width = 0;
        radius = 0;
    }

    // Constructor for rectangle
    Shape(double l, double w) {
        length = l;
        width = w;
    }

    // Constructor for circle
    Shape(double r) {
        radius = r;
    }

    // Method overloading - area for rectangle
    double area(double l, double w) {
        return l * w;
    }

    // Method overloading - area for circle
    double area(double r) {
        return 3.14159 * r * r;
    }

    // Method overloading - perimeter for rectangle
    double perimeter(double l, double w) {
        return 2 * (l + w);
    }

    // Method overloading - perimeter for circle
    double perimeterCircle(double r) {
        return 2 * 3.14159 * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Shape Calculator ===");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            // Rectangle
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter width: ");
            double width = sc.nextDouble();

            Shape rect = new Shape(length, width);
            System.out.println("\n--- Rectangle ---");
            System.out.println("Area: " + rect.area(length, width));
            System.out.println("Perimeter: " + rect.perimeter(length, width));

        } else if (choice == 2) {
            // Circle
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();

            Shape circle = new Shape(radius);
            System.out.println("\n--- Circle ---");
            System.out.println("Area: " + circle.area(radius));
            System.out.println("Perimeter: " + circle.perimeterCircle(radius));

        } else {
            System.out.println("Invalid choice! Please run again.");
        }

        sc.close();
    }
}
