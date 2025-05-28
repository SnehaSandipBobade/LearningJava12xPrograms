package ex_03_JavaTasks;

import java.util.Scanner;

public class Lab087_25May_Task2 {
    public static void main(String[] args) {
        System.out.println("Java program to Count vowels and consonants in a String.");
        String InpString;
        int cnt=0;int strLength;
        int concnt=0;
        int spcacecnt=0;
        int numcnt=0;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter any string , i will count vowels and consonants in String");
        if (!scanner.hasNextLine())
        {
            System.out.println("Enter string only, Invalid input: ");

        }
        else
         {
            InpString= scanner.nextLine();
            strLength= InpString.length();
            for(int i=0;i<strLength;i++)
                {
                    if (InpString.charAt(i) == ' ')
                    {
                    spcacecnt++;
                    }
                    else if(InpString.charAt(i)>='a'&&InpString.charAt(i)<='z')
                    {
                     if (InpString.charAt(i) == 'a' || InpString.charAt(i) == 'e' ||
                           InpString.charAt(i) == 'i' || InpString.charAt(i) == 'o'
                            || InpString.charAt(i) == 'u')
                        {
                        cnt++;
                        }
                    else
                        {
                        concnt++;
                        }
                    }
                    else
                    {
                    numcnt++;
                    }
            }
            System.out.println("Vowels count in string is : "+cnt);
            System.out.println("Consonants count in string is : "+concnt);
             System.out.println("Number or special char in string is : "+numcnt);
        }
    }
}
