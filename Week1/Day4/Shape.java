public class Shape {

    // Area of circle
    public double area(double radius) {
        return 3.14159 * radius * radius;
    }

    // Area of rectangle
    public double area(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

        double circleArea = shape.area(5); // circle with radius 5
        double rectangleArea = shape.area(4, 6); // rectangle 4x6

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
