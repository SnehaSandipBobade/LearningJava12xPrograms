package Java_Test;

public class Q004 {
    public static void main(String[] args) {
        System.out.println("Pre Increment");
        int a = 10;
        System.out.println(a);
        int result = ++a;
        System.out.println(result);
        System.out.println(a);

        int result1= --a;
        System.out.println(a);
        System.out.println(result1);

        System.out.println("Post Increment");
        int b = 10;
        int result2 = b++;
        System.out.println(b);
        System.out.println(result);
        System.out.println(b);
        int result3= b--;
        System.out.println(b);
        System.out.println(result3);

    }
}
