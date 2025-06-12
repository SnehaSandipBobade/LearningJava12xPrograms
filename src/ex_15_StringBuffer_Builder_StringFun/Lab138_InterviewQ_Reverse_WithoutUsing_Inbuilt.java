package ex_15_StringBuffer_Builder_StringFun;

import java.util.Scanner;

public class Lab138_InterviewQ_Reverse_WithoutUsing_Inbuilt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string fr Reverse (without string function) ");
        String inPStr= sc.nextLine();

        for (int i= inPStr.length()-1;i>=0;i--)
        {
            System.out.print(inPStr.charAt(i));
        }
        System.out.println();
        System.out.println("Enter string fr Reverse (using string function) ");
        String input = sc.nextLine();
        StringBuffer sb = new StringBuffer(input);
        System.out.println(sb.reverse());
    }
}
