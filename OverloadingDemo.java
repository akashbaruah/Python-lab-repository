class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Multiply integers: " + c.multiply(5, 4));
        System.out.println("Multiply doubles: " + c.multiply(3.2, 2.5));
    }
}
