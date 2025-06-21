package Java_Test;

import java.util.Scanner;

public class Q009 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double result = 0;

        System.out.println("Simple Calculator");


        System.out.print("Enter the first number: ");
        double num1;
        num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0); // Read the first character of the input as the operator
        System.out.print("Enter the second number: ");
        double num2;
        num2 = scanner.nextDouble();
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                // Handle division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                break;
        }
    }
}
