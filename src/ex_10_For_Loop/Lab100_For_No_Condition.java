package ex_10_For_Loop;

public class Lab100_For_No_Condition {
    public static void main(String[] args) {
        System.out.println("loop without condition");
        System.out.println("exit code 130");
        // exit code 130 , (Stop by Yourself- Kill) Red Button - interrupted by signal
        // exit code 0 - Successful
        for (int i = 0; ; i++) {
            System.out.println(i);
        }

    }
}
