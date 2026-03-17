public class ShapeMain {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 8);

        circle.displayInfo();
        System.out.println("Area: " + circle.area());

        rectangle.displayInfo();
        System.out.println("Area: " + rectangle.area());

        triangle.displayInfo();
        System.out.println("Area: " + triangle.area());
    }
}

// Базовый класс
class Shape {

    String name;

    Shape(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Shape: " + name);
    }

    double area() {
        return 0;
    }
}

// Круг
class Circle extends Shape {

    double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius);
    }
}

// Прямоугольник
class Rectangle extends Shape {

    double width;
    double height;

    Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

// Треугольник
class Triangle extends Shape {

    double base;
    double height;

    Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Base: " + base + ", Height: " + height);
    }
}