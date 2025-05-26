package ex_03_JavaTasks;

import java.util.Scanner;

public class Lab084_24May_Task2 {
    public static void main(String[] args) {
        System.out.println("Task 3 : Factorial for n = user will enter the n from 0 to Max(int)");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter no. ");
        int n;


//        if(maxn> Integer.MAX_VALUE){
//            System.out.println("Value is grater than max value" );
//        scanner.next();
//        }
        if(!scanner.hasNextInt()) {
            System.out.println(" Invalid input or its out of max");
                        //break;
        }
        else {
            n = scanner.nextInt();

            int fact = 1;
            if (n == 0) {
                System.out.println(n + " Factorial= 1");
            } else {
                for (int i = n; i >= 1; i--) {
                    fact = fact * i;
                }
                System.out.println(" Factorial of " + n + " is = " + fact);
            }

        }
    }
}
