package Java_Test;

import java.util.Scanner;

public class Q003 {
    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output.
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Enter Values for Variables ---");

        System.out.print("Enter integer value for 'a': ");

        a = scanner.nextInt();
        System.out.print("Enter integer value for 'b': ");
        b = scanner.nextInt();
        System.out.print("Enter integer value for 'c': ");
        c = scanner.nextInt();
        System.out.println("Variables Used:");
        System.out.println("  a = " + a);
        System.out.println("  b = " + b);
        System.out.println("  c = " + c);

        if(a<b) {
            System.out.println("a is less than b");
        }
            if(a>b) {
                System.out.println("a is Grater than b");
            }
            if(a<=b) {
                System.out.println("a is less than or equal to b");
            }
            if(a==b) {
                System.out.println("a is equal to b");
            }
            if(a!=b) {
            System.out.println("a is not equal to b");
            }

        System.out.println("Logical Operators");

        boolean isEqualAB = (a == b);
        System.out.println("a == b (" + a + " == " + b + "): " + isEqualAB);

        boolean isEqualAC = (a == c);
        System.out.println("a == c (" + a + " == " + c + "): " + isEqualAC);

        // Not equal to (!=)
        boolean isNotEqualAB = (a != b);
        System.out.println("a != b (" + a + " != " + b + "): " + isNotEqualAB);

        boolean isNotEqualAC = (a != c);
        System.out.println("a != c (" + a + " != " + c + "): " + isNotEqualAC);

    }
}
