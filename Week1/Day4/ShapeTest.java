import java.util.Scanner;

// Abstract Shape class
abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

// Rectangle subclass
class Rectangle extends Shape {
    double length, width;

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

// Circle subclass
class Circle extends Shape {
    double radius;

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

// Main class to test Shape
public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose shape (Rectangle/Circle):");
        String shapeType = scanner.nextLine();

        Shape shape;

        if (shapeType.equalsIgnoreCase("Rectangle")) {
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter width: ");
            double width = scanner.nextDouble();
            shape = new Rectangle(length, width);

        } else if (shapeType.equalsIgnoreCase("Circle")) {
            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();
            shape = new Circle(radius);

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
