package ex_07_IncrementDecreOpe;

public class Lab072_DecrExp1 {
    public static void main(String[] args) {
        int a = 10;
        int result_post = a--;
        System.out.println(result_post); // 10
        System.out.println(a); //9
        System.out.println(a-- + a--);
        System.out.println(a);
    }
}
