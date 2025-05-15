package ex_03_JavaTasks;

public interface Lab023Task2_17May {
    public static void main(String[] args) {
        System.out.println("Q2. Write a code for condition -Use the ternary operator, nested ternary operator. " +
                "If we have three numbers, N1, N2, and N3, give me the maximum between the three numbers");
        int N1= 140,N2=2000,N3=3;
        int MaxN= N1>N2?(N1>N3?N1:N3):(N2>N3?N2:N3);
        System.out.println("N1 = "+N1+" N2 ="+N2+" N3 = "+N3 );
        System.out.println(" Maximum number is "+ MaxN);

    }
}
