package Java_Test;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        System.out.println("Write a program that classifies a triangle based on its side lengths. " +
                "Given three input values representing the lengths of the sides, " +
                "determine if the triangle is equilateral (all sides are equal)," +
                " isosceles (exactly two sides are equal), or scalene (no sides are equal). " +
                "Use an if-else statement to classify the triangle.");
        System.out.println("Enter tringles 3 sides:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side1 = ");
        int side1= scanner.nextInt();
        System.out.print("Enter side2 = ");
        int side2= scanner.nextInt();
        System.out.print("Enter side3 = ");
        int side3= scanner.nextInt();
        System.out.println();
//        System.out.println("Side1= "+side1);
//        System.out.println("Side2= "+side2);
//        System.out.println("Side3= "+side3);

        if (side1==side2 && side2==side3 && side1==side3)
        {
            System.out.println("the triangle is equilateral (all sides are equal)");
        }
        else{
            if (side1==side2 || side2==side3 || side1==side3)
                System.out.println("the triangle is isosceles (exactly two sides are equal)");
            else {
                System.out.println("the triangle is scalene (no sides are equal)");
            }

        }
    }
}
