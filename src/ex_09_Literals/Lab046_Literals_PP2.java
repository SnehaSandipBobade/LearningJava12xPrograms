package ex_09_Literals;

public class Lab046_Literals_PP2 {
    public static void main(String[] args) {
        float pi = 3.14f;
        float pi2 = 3.14F;
        float x = 10.00f;
        System.out.println(pi+pi2+x);// + will add 3 float var
       // System.out.printf(pi+pi2+x); will give error
        System.out.println("pi="+pi+" pi2="+ pi2+" x="+x);// will print all value
        //System.out.println(pi,pi2,x); will give error
    }
}
