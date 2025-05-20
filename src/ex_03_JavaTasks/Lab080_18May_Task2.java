package ex_03_JavaTasks;

public class Lab080_18May_Task2 {
    public static void main(String[] args) {
        System.out.println("#Task2");
        System.out.println("Q2.Guess the output: ");
        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;
        //c = 33+11+22+13+24=103
        //a+b -> EXP1 -> 11+22= 33
        //a++ -> EXP2 -> 11
        //a=12
        //b++ -> EXP3 -> 22
        //b=23
        //++a -> EXP4 -> 13
        //a=12
        //b=24
        //++b -> EXP5 -> 24


        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);
    }
}
