package ex_03_JavaTasks;

import java.util.Scanner;

public class Lab085_24May_Task3 {
    public static void main(String[] args) {
        System.out.println(" Enter Grade out of A, B, C, D, F to check progress:");
        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();
        if (c.isEmpty()) {
            System.out.println("No character entered. Exiting.");
            scanner.close();
            return; // Exit the program if no input
        }
        char c1=c.charAt(0);
        c1= Character.toUpperCase(c1);
        switch (c1){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Needs Improvement");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
                break;

        }
    }
}
