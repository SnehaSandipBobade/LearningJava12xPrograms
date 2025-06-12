package ex_11_While;

public class Lab115_While_Sum_1T10 {
    public static void main(String[] args) {
        System.out.println("sum frm 1 - 10 ");
        int i = 0; // Init
        int sum = 0;
        while(i<=10){ // Condition (must be true to enter the loop)
            sum=sum+i;

            i++; // Updation


        }
        System.out.println("Sum = "+ sum);
    }
}
