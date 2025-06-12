package ex_10_For_Loop;

import java.util.Scanner;

public class Lab102_For_Ioop_even_1To100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Even numbers between 1-100");
        for (int i =1;i<=100;i++)
        {
            if (i%2 == 0) {
                System.out.println(i);

            }
        }
    }

}
