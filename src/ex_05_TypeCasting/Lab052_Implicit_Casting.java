package ex_05_TypeCasting;

public class Lab052_Implicit_Casting {
    public static void main(String[] args) {
        System.out.println("Implicit casting");
        byte b = 10;
        int a = b; // Valid syntax -> smaller data into the bigger data type
        // Implicit - Casting - Widening
        long c=a;
        System.out.println(c);

    }
}
