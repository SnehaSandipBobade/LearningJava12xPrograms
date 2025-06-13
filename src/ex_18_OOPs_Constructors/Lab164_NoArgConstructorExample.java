package ex_18_OOPs_Constructors;

public class Lab164_NoArgConstructorExample {
    String message;

    // User-defined no-argument constructor
    public Lab164_NoArgConstructorExample() {
        message = "Hello from No-arg Constructor!"; // Custom default value
        System.out.println("No-arg Constructor called.");
    }

    void display() {
        System.out.println("No-arg Constructor Example:");
        System.out.println("Message: " + message);
    }
}
