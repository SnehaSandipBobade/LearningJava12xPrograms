package ex_03_JavaTasks;

public class Lab081_18May_Task3 {
    public static void main(String[] args) {
        System.out.println("#Task3");
        System.out.println("Q3. What will be the output:");
        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;
        // m = 6
        // EXP1= i-- -> 1
        //i = 0
        //EXP2= j-- -> 2
        //j = 1
        //EXP3= k-- -> 3
        //k=2
        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
    }
}
