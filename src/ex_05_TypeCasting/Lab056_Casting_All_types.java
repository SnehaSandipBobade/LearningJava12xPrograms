package ex_05_TypeCasting;

public class Lab056_Casting_All_types {

    public static void main(String[] args) {


        int course = 100;
        float GST = 18.45f;
//        int total1 = course+GST; // Narrowing - Implicit
        int total = course+(int)GST; // Narrowing - Explicit
        System.out.println(total);


        float total2 = course+GST; // Widening - auto - implicit
//        float total3 = (float)course+GST; // Widening  - Explicit
        System.out.println(total2);





    }
}
