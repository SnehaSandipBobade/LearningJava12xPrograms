package ex_03_JavaTasks;

import java.util.Scanner;

public class Lab083_24May_Task1 {
    public static void main(String[] args) {
        System.out.println("Task 2 :Write a Java program that takes a month number (1-12) and " +
                "prints the number of days in that month using a switch statement. " +
                "Handle February separately for leap years.\n" +
                "a year is a leap year if it is divisible by 4, " +
                "but not by 100, unless it is also divisible by 400.");
        boolean leap = false;
        Scanner scanner = new Scanner(System.in);
        int n=0;
        int m=0;
        System.out.println("Enter Year : ");
        if(scanner.hasNextInt())
        {
            n = scanner.nextInt();
            if (n >0) {
                if ((n % 4 == 0 || n % 400 == 0) && !(n % 100 == 0)) {
                    System.out.println("Year is leap year");
                    leap = true;
                } else {
                    System.out.println("Year is not a leap year");
                }

            } else{
                System.out.println("Year should be positive");
            }
        }
        else{
            System.out.println("Year should not be char or string, please enter digit above 0");
            scanner.next();
        }
        System.out.println("Enter Month : ");
        if(scanner.hasNextInt()) {
             m = scanner.nextInt();

            switch (m) {
                case 1:
                    System.out.println("Month is January , Day in month is : 31");
                    break;
                case 2: {
                    if (leap == true) {
                        System.out.println("Month is February , Day in month is : 29");

                    } else {
                        System.out.println("Month is February, Day in month is : 28");
                    }
                }
                break;

                case 3:
                    System.out.println("Month is March , Day in month is : 31");
                    break;

                case 4:
                    System.out.println("Month is April , Day in month is : 30");
                    break;

                case 5:
                    System.out.println("Month is May , Day in month is : 31");
                    break;

                case 6:
                    System.out.println("Month is June , Day in month is : 30");
                    break;

                case 7:
                    System.out.println("Month is July , Day in month is : 31");
                    break;

                case 8:
                    System.out.println("Month is August , Day in month is : 31");
                    break;

                case 9:
                    System.out.println("Month is September , Day in month is : 30");
                    break;

                case 10:
                    System.out.println("Month is October , Day in month is : 31");
                    break;

                case 11:
                    System.out.println("Month is November , Day in month is : 30");
                    break;

                case 12:
                    System.out.println("Month is December , Day in month is : 31");
                    break;

                default:
                    System.out.println("Invalid month entered!");
                    break;

            }
        }
        else {
            System.out.println("Month should be digit");
            scanner.next();
        }
        }

}
