package ex_10_For_Loop;

public class Lab104_greater_vs_equal {
    public static void main(String[] args) {
        System.out.println("greater_vs_equal fr same range");
        for (int i =1;i<10;i++)
        {
            System.out.println(i);// will print 1 - 9
        }
        System.out.println("--");
        for (int i = 1;i<=10;i++)
        {
            System.out.println(i);// will print 1 - 10
        }
    }
}
