package ex_03_JavaTasks;

import java.util.Scanner;

public class Lab086_25May_Task1 {

    public static void main(String[] args) {
        //int digitcnt;
        int cnt=0;
        int resNo=0;
        int mod=0;
        System.out.println("Reverse the number using for loop. (In - 12345, Out - 54321)");
        System.out.println("Enter number to reverse it : ");
        Scanner scanner= new Scanner(System.in);
        if(!scanner.hasNextInt()){
            System.out.println("Invalid input ,numeric value allowed");
        }
        else {
            int invalue = scanner.nextInt();
            if ((invalue == 0)) {
                System.out.println("Number is 1 digit Reverse is same : " + invalue);
            } else {
                while (invalue > 0) {
                    mod = invalue % 10;
                    invalue = invalue / 10;
                    resNo = (resNo * 10) + mod;

                }
                System.out.println("Reverese number = " + resNo);
            }
        }
    }
}
