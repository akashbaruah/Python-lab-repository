class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) { base = b; height = h; }

    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double length, breadth;
    Rectangle(double l, double b) { length = l; breadth = b; }

    double area() {
        return length * breadth;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s;

        s = new Circle(5);
        System.out.println("Circle area: " + s.area());

        s = new Triangle(10, 4);
        System.out.println("Triangle area: " + s.area());

        s = new Rectangle(6, 3);
        System.out.println("Rectangle area: " + s.area());
    }
}
