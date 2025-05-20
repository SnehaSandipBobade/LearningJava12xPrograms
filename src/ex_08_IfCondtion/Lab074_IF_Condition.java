package ex_08_IfCondtion;

public class Lab074_IF_Condition {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age > 18){
            System.out.println("You can vote!");
        }else{
            System.out.println("You can't vote!");
        }



    }
}
