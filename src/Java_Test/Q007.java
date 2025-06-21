package Java_Test;

import java.util.Scanner;

public class Q007 {
    public static void main(String[] args) {
        boolean leap = false;
        Scanner scanner = new Scanner(System.in);
        int n=0;
        int m=0;
        System.out.println("Enter Year : ");
        if(scanner.hasNextInt())
        {
            n = scanner.nextInt();
            if (n >0) {
                if ((n % 4 == 0 || n % 400 == 0) && !(n % 100 == 0)) {
                    System.out.println("Year is leap year");
                    leap = true;
                } else {
                    System.out.println("Year is not a leap year");
                }

            } else{
                System.out.println("Year should be positive");
            }
        }
        else{
            System.out.println("Year should not be char or string, please enter digit above 0");
            scanner.next();
        }
    }
}
