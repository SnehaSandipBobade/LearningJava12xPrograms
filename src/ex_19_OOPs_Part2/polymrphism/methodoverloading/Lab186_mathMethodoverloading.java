package ex_19_OOPs_Part2.polymrphism.methodoverloading;

public class Lab186_mathMethodoverloading {
    public static void main(String[] args) {
        Lab185_MathOperation m1 = new Lab185_MathOperation();
        int r = m1.add(3,4);
        System.out.println(r);

        int r1 = m1.add(3,4,5);
        System.out.println(r1);


        double r0 = m1.add(3.34,4.56);
        System.out.println(r1);
    }
}
