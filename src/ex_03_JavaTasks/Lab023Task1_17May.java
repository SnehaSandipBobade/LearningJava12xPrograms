package ex_03_JavaTasks;

public class Lab023Task1_17May {
    public static void main(String[] args) {
        System.out.println("Q1. Write a code for -The ternary operator and let me know if I " +
                "give you a number. Let me know if it is even or odd.");
            int i=20,j=23;
        //System.out.println("Enter number to check it is even or odd ");
        String res= i%2==0?"Even number":"Odd number";
        System.out.println("i = "+ i +" It is "+ res);
        String res1 = j%2==0?"Even number":"Odd number";
        System.out.println("j = "+ j + " It is "+ res1);

    }
}
