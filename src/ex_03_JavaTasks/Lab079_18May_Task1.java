package ex_03_JavaTasks;

public class Lab079_18May_Task1 {
    public static void main(String[] args) {
        System.out.println("#Task- 18th May:");
        System.out.println("Q1. What will be the output of following code:");
        int i = 11;

        i = i++ + ++i;

        //i++ -> EXP1 ->11
        // i= 12
        //++i -> EXP2 ->13
        //11+13= 24

        System.out.println(i);


    }
}
