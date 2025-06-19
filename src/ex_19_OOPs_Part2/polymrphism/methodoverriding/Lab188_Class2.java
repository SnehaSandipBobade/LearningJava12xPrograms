package ex_19_OOPs_Part2.polymrphism.methodoverriding;

public class Lab188_Class2 extends Lab187_Class1 {
    void p1(){
        System.out.println("method 1");
    }

    @Override
    void home(){
        System.out.println("override method - 3BHK");
    }
}
