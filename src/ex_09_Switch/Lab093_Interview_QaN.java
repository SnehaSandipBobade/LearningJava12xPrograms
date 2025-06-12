package ex_09_Switch;

import java.util.Scanner;

public class Lab093_Interview_QaN {
    public static void main(String[] args) {
        System.out.println("output guess ");
        System.out.println("Enter char to ASCII match or not");
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();

        char ch1 = ch.charAt(0);
        switch (ch1){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }
    }
}
