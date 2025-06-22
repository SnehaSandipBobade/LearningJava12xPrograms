package Java_Test;

public class Person {
    String name="sneha";
    int age = 100;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("A new Person object created: " + name);
    }
    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        Person person1 = new Person("Sneha", 30);
        Person person2 = new Person("Sandip", 35);
        System.out.print("Details for Person 1: ");
        person1.printDetails();


        System.out.print("Details for Person 2: ");
        person2.printDetails();

    }


}
