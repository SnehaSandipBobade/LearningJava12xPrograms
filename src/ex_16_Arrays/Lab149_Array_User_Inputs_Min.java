package ex_16_Arrays;

import java.util.Scanner;

public class Lab149_Array_User_Inputs_Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array(int)");
        int size = scanner.nextInt();

        int[] numbers_marks =  new int[size];
        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println("Enter the elements -> " + i);
            numbers_marks[i] = scanner.nextInt();
        }
        System.out.println(" --- Print the values");
        for(int marks : numbers_marks){
            System.out.println(marks);
        }
        int min = numbers_marks[0];


        // logic
        for(int j=0;j< numbers_marks.length;j++){
            if(numbers_marks[j] < min){
                min = numbers_marks[j];
            }
        }
        System.out.println("Min is : "+min);
    }
}
