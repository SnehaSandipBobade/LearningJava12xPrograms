package ex_18_OOPs_Constructors;

public class Lab165_ParameterizedConstructorExample {
    String productName;
    double price;

    // Parameterized constructor
    public Lab165_ParameterizedConstructorExample(String productName, double price) {
        productName = productName; // 'this' keyword refers to the current object's instance variable
        price = price;
        System.out.println("Parameterized Constructor called for " + productName);
    }
    void display() {
        System.out.println("Parameterized Constructor Example:");
        System.out.println("Product: " + productName + ", Price: $" + String.format("%.2f", price));
    }

    public static void main(String[] args) {
        new Lab165_ParameterizedConstructorExample("Sneha",12.3);
    }
}
