package ex_10_For_Loop;

public class Lab107_ForLoop_odd_Number {
    public static void main(String[] args) {
        System.out.println("odd numbers between 1 - 100");
        for (int i =1;i<=100;i++)
        {
            if (!(i%2 ==0)) {
                System.out.println(i);
            }
        }
    }
}
