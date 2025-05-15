package ex_01_Java_Basics;

public class Lab004_Forloop {
    public static void main(String[] args) {
        int num=5,i=1,res=0;
        System.out.println("Table of 5 :");
        for(i=1;i<=10;i++){
            res=num*i;
            System.out.println(num+"*"+i+"="+res);
        }

    }
}
