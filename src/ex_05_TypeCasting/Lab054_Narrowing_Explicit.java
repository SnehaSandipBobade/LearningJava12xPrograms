package ex_05_TypeCasting;

public class Lab054_Narrowing_Explicit {
    public static void main(String[] args) {
        int val = 300;
//        byte b = val; // Narrowing - Implicit JVM to do it. - Data loss will be there.
        byte b1 = (byte) val; // Narrowing - EXPLICIT JVM to do it. - Data loss will be there.
        System.out.println(b1); // 44
        // int can store 4 byte = 32 bits
        //binary value for 300= 00000001 00101100
        // catsting into byte can store 8 bits = 00101100(which is 44)
    }
}
