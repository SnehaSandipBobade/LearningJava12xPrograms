package ex_10_For_Loop;

import java.util.Scanner;

public class Lab109_For_Loop_SumofN_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to sum till entered number : ");

        int num = sc.nextInt();
        int res= 0;
        for (int i =1; i<= num; i++)
        {
          res=res+i;
        }
        System.out.println("Sum frm 1 to "+num+" = "+ res);
    }
}
