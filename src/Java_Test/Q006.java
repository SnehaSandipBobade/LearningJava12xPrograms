package Java_Test;

import java.util.Scanner;

public class Q006 {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int largestNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Find the Largest Among Three Numbers ---");
        System.out.print("Enter the first integer: ");
        n1= scanner.nextInt();
        System.out.print("Enter the second integer: ");
        n2= scanner.nextInt();
        System.out.print("Enter the third integer: ");
        n3=scanner.nextInt();
        if (n1 >= n2) {
            if (n1 >= n2) {
                largestNumber = n1;
            } else {
                largestNumber = n3;
            }
        } else {
            if (n2 >= n3) {
                largestNumber = n2;
            } else {
                largestNumber = n3;
            }
        }

        System.out.println("Among " + n1 + ", " + n2 + ", and " + n3 + ":");
        System.out.println("The largest number is: " + largestNumber);


    }

}
