class Rectangle {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
