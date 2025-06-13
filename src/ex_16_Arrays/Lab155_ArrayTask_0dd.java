package ex_16_Arrays;

import java.util.Scanner;

public class Lab155_ArrayTask_0dd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array(int)");

        int size = sc.nextInt();

        int[] int_array =  new int[size];
        for (int i = 0; i < int_array.length; i++) {
            System.out.println("Enter the elements -> " + i);
            int_array[i] = sc.nextInt();
        }
        System.out.println(" ---The values");
        for(int marks : int_array)
            System.out.println(marks);

        // logic
        System.out.println("odd numbers frm array --");
        for(int j = 0; j< int_array.length; j++)
            if (!(int_array[j] % 2 == 0))
                System.out.println(int_array[j]);
    }
}
