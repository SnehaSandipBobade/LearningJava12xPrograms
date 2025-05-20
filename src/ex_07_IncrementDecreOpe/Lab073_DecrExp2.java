package ex_07_IncrementDecreOpe;

public class Lab073_DecrExp2 {
    public static void main(String[] args) {
        int a= 10;
        int result = --a; // 9
        System.out.println(result);
        System.out.println(a); // 9
        System.out.println(--a+--a);
        System.out.println(a);
        System.out.println(--a- --a);
    }
}
