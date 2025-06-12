package ex_09_Switch;

import java.util.Scanner;

public class Lab090_Switch_WeekDay {
    public static void main(String[] args) {
        System.out.println("Enter the day to 1 to 7");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            int day = sc.nextInt();
            switch (day)
            {
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thur");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Enter int number from 1 to 7 only, invalid input!");
            }
        }
        else {
            System.out.println("You are wrong, Why you are entering non int values");
        }
    }
}
