package ex_09_Switch;

import java.util.Scanner;

public class Lab096_INTERVIEW_MenuSelector {
    public static void main(String[] args) {
        System.out.println("MenuSelector");
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Our Menu ---");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        System.out.println("3. Juice");
        System.out.println("4. Water");
        System.out.print("Enter your choice (1-4): ");

        if (scanner.hasNext()) {
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("You selected Coffee. Enjoy!");
                    break;
                case 2:
                    System.out.println("You selected Tea. A perfect brew.");
                    break;
                case 3:
                    System.out.println("You selected Juice. Refreshing!");
                    break;
                case 4:
                    System.out.println("You selected Water. Staying hydrated!");
                    break;
                default:
                    System.out.println("Invalid choice. Please pick from 1 to 4.");
                    break;
            }

        }
        else {
            System.out.println("Invalid input! Please enter a number.");
        }
    }
}
