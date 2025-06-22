package Java_Test;

public class Calculator {
    public int add(int a, int b) {
        System.out.println("Adding two integers: " + a + " + " + b);
        return a + b;
    }
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers: " + a + " + " + b + " + " + c);
        return a + b + c;
    }
    public double add(double a, double b) {
        System.out.println("Adding two doubles: " + a + " + " + b);
        return a + b;
    }
    public double add(int a, double b) {
        System.out.println("Adding an int and a double: " + a + " + " + b);
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Method Overloading Calculator");

        Calculator calc = new Calculator();
        calc.add(10,20);
        calc.add(10,950000000);
        calc.add(95000000,500000);
        calc.add(10,20,30);

    }
}
