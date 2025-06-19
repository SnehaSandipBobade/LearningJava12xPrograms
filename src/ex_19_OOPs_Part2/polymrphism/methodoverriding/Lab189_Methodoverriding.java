package ex_19_OOPs_Part2.polymrphism.methodoverriding;

public class Lab189_Methodoverriding {
    public static void main(String[] args) {
        Lab187_Class1  p = new Lab187_Class1();
        p.home();
        p.f1();

        Lab188_Class2 f1 = new Lab188_Class2();
        f1.home();
        f1.f1();

        Lab187_Class1 f2 = new Lab188_Class2();
        f2.home();

    }
}
