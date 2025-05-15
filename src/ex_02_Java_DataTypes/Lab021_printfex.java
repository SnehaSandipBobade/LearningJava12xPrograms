package ex_02_Java_DataTypes;

public class Lab021_printfex {
    public static void main(String[] args) {
        String fname="Sandip";
        String lName="Bobade";
        int  age=33;
        System.out.printf("Method\t\t Behavior");
        System.out.print("\n");
        System.out.printf("printf()\tAllows formatted output, similar to C-style formatting .");
        System.out.print("\n");
        System.out.printf(" Using printf(): ");
        System.out.print("\n");
        System.out.printf(" Name: %s",fname);
        //System.out.printf(fname);
        System.out.printf(" LastName: %s",lName);
        //System.out.printf(lName);
        System.out.printf(" Age: %d",age);
        //System.out.printf(age);
    }
}
