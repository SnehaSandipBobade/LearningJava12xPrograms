package ex_02_Java_DataTypes;

public class Lab018_NAn {
    public static void main(String[] args) {
        System.out.println("What is Float.NaN?");
        System.out.println("Answer: \"Not a Number\" – returned when a float operation has an undefined result (like 0.0f / 0.0f).");
        System.out.println("What is Float.POSITIVE_INFINITY and NEGATIVE_INFINITY?");
        System.out.println("Answer: Returned when values exceed Float.MAX_VALUE or underflow");

        float f=0.0f/ 0.0f;
        float inf = 1.0f / 0.0f; // Infinity
        System.out.println("Infinity"+inf);
        float nan = 0.0f / 0.0f; // NaN
        System.out.println("NaN"+nan);
        System.out.println("How can you check for NaN in Java?");
        if (Float.isNaN(f)) {
            // handle NaN
            System.out.println("What is the output of Float.compare(3.1f, 3.1f)?");
            System.out.println("Answer: 0 (equal). Returns a value <0, 0, or >0 depending on comparison.");
        }
    }
}
