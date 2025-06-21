package Java_Test;

import java.util.Scanner;

public class Q005 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter an integer number: ");


        if (scanner.hasNextInt()) {
            int number = scanner.nextInt(); // Read the integer input


            if (number > 0) {

                System.out.println("The number " + number + " is POSITIVE.");
            } else if (number < 0) {

                System.out.println("The number " + number + " is NEGATIVE.");
            } else {

                System.out.println("The number " + number + " is ZERO.");
            }
        } else {

            System.out.println("Invalid input! Please enter a valid integer number.");
        }
    }
}
