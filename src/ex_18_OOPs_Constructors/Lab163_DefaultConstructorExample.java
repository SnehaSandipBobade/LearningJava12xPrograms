package ex_18_OOPs_Constructors;

public class Lab163_DefaultConstructorExample {
    String name;
    int id;
    // No constructor is explicitly defined here.
    // Java automatically provides a public, no-argument default constructor:
    // public DefaultConstructorExample() {
    //     name = null; // Default value for String
    //     id = 0;      // Default value for int
    // }
    void display() {
        System.out.println("Default Constructor Example:");
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
