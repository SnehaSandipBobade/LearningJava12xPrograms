package Java_Test;

import java.util.Scanner;

public class Q008 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Day of the Week Display");
        System.out.print("Enter a number (1-7) to find the day of the week: ");


        if (scanner.hasNextInt()) {
            int dayNumber = scanner.nextInt();


            switch (dayNumber) {
                case 1:
                    System.out.println("Day " + dayNumber + " is: Monday");
                    break;
                case 2:
                    System.out.println("Day " + dayNumber + " is: Tuesday");
                    break;
                case 3:
                    System.out.println("Day " + dayNumber + " is: Wednesday");
                    break;
                case 4:
                    System.out.println("Day " + dayNumber + " is: Thursday");
                    break;
                case 5:
                    System.out.println("Day " + dayNumber + " is: Friday");
                    break;
                case 6:
                    System.out.println("Day " + dayNumber + " is: Saturday");
                    break;
                case 7:
                    System.out.println("Day " + dayNumber + " is: Sunday");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a number between 1 and 7.");
                    break;
            }
        } else {

            System.out.println("Invalid input! Please enter a whole number.");
        }


    }
}
