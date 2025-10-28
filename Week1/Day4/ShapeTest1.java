import java.util.Scanner;

// Abstract Shape class
abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

// Rectangle subclass with constructor overloading
class Rectangle extends Shape {
    double length, width;

    // Default constructor
    Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    // Parameterized constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

// Circle subclass with constructor overloading
class Circle extends Shape {
    double radius;

    // Default constructor
    Circle() {
        this.radius = 1;
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main class to test shapes
public class ShapeTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose shape (Rectangle/Circle):");
        String shapeType = scanner.nextLine();

        Shape shape;

        if (shapeType.equalsIgnoreCase("Rectangle")) {
            System.out.print("Do you want to enter dimensions? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width);
            } else {
                shape = new Rectangle(); // default constructor
            }

        } else if (shapeType.equalsIgnoreCase("Circle")) {
            System.out.print("Do you want to enter radius? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
            } else {
                shape = new Circle(); // default constructor
            }

        } else {
            System.out.println("Invalid shape type!");
            scanner.close();
            return;
        }

        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());

        scanner.close();
    }
}
