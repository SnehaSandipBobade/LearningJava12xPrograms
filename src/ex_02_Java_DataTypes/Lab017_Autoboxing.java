package ex_02_Java_DataTypes;

public class Lab017_Autoboxing {
    public static void main(String[] args) {
        System.out.println("How does autoboxing work with float?");
        Float fObj = 3.14f; // autoboxing
        System.out.println("autoboxing"+fObj);
        float f = fObj;     // unboxing
        System.out.println("unboxing"+f);
    }
}
