package ex_09_Switch;

import java.util.Scanner;

public class Lab092_Prime_number {
    public static void main(String[] args) {
        System.out.println("Enter Number to check its prime or not");
        Scanner sc = new Scanner(System.in);
//        Boolean prime=false;
        int j =0;
        if(sc.hasNext())
        {
            int num= sc.nextInt();
            if (num==0 || num==1) {
                j++;
                System.out.println("Number is nt prime");
            }
            else
            {
                for (int i =2;i<num;i++)
                {
                    if (num%i==0)
                     j++;
                }
                if (j==0)
                    System.out.println("Number is prime");
                else
                   System.out.println("Number is nt prime");
            }
        }
        else {
            System.out.println("Enter int number...");

        }
    }
}
