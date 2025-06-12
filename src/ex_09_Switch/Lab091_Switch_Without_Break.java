package ex_09_Switch;

import java.util.Scanner;

public class Lab091_Switch_Without_Break {
    public static void main(String[] args) {
        System.out.println("Enter month number form 1 to 12 ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()) {
            int mnth = sc.nextInt();
            switch (mnth) {
                case 1:
                    System.out.println("Jan");
                    break;
                case 2:
                    System.out.println("Feb");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("Juy");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("Sept");
                    break;
                case 10:
                    System.out.println("ct");
                    break;
                case 11:
                    System.out.println("Nv");
                    break;
                case 12:
                    System.out.println("Dec");
                    break;
                default:
                    System.out.println("Enter int number from 1 to 12 only, invalid input!");

            }
        }
        else{

            System.out.println("You are wrong, Why you are entering non int values");
        }
    }
}
