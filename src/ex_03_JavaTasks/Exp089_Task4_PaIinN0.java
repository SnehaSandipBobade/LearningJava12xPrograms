package ex_03_JavaTasks;

import java.util.Locale;
import java.util.Scanner;

public class Exp089_Task4_PaIinN0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker ---");
        System.out.print("Enter a string to check if it's a palindrome: ");


        String userInput = scanner.nextLine();
        if (userInput.isEmpty()) {
            System.out.println("You entered an empty string. An empty string is considered a palindrome.");
        }
        else {

            System.out.println("\nStrict Check (case and spaces matter):");


            StringBuilder originalStringBuilderStrict = new StringBuilder(userInput);


            StringBuilder reversedStringBuilderStrict = originalStringBuilderStrict.reverse();


            String reversedStrStrict = reversedStringBuilderStrict.toString();


            boolean isStrictPalindrome = userInput.equals(reversedStrStrict);
            System.out.println("Is \"" + userInput + "\" a palindrome? " + isStrictPalindrome);

            System.out.println("\nFlexible Check (ignore case, spaces, punctuation):");

            String processedStrFlexible = userInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            if (processedStrFlexible.isEmpty()) {
                System.out.println("Is \"" + userInput + "\" a palindrome? " + true); // It's considered a palindrome
            } else {

                StringBuilder sbFlexible = new StringBuilder(processedStrFlexible);


                sbFlexible.reverse();


                String reversedStrFlexible = sbFlexible.toString();


                boolean isFlexiblePalindrome = processedStrFlexible.equals(reversedStrFlexible);
                System.out.println("Is \"" + userInput + "\" a palindrome? " + isFlexiblePalindrome);
            }

        }

    }
}
