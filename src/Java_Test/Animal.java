package Java_Test;
import java.util.Scanner;

public abstract class Animal {
    String name;
    public void makeSound(String name) {
        this.name=name;
        System.out.println(name + " makes a generic animal sound.");
    }

    public abstract void makeSound();
}
