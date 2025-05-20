package ex_05_TypeCasting;

public class Lab053_Explicit_Casting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid Syntax -> Widening - Implicit Casting - Automatically done.
        int a1 = (int)b; // Widening Explicit Casting (int) - optional
        System.out.println(" Widening Explicit Casting a1 = "+a1);
    }
}
