package ex_12_DoWhile;

public class Lab118_Diff_While_Dowhile {
    public static void main(String[] args) {

        int a = 0;
        while (a < 0) {
            System.out.println(a);
            a++;
        }

        do{
            System.out.println(a);
            a++;
        }while (a<0);


    }
}
