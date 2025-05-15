package ex_01_Java_Basics;

public class Lab012_float_basic {
    public static void main(String[] args) {
        System.out.println("1. What is the size of a float in Java?");
        System.out.println("Answer: 32 bits (4 bytes)");
        System.out.println("2. What is the range of a float in Java?");
        System.out.println("Answer: Approximately ±3.40282347 × 10³⁸ (7 decimal digits of precision)");
        System.out.println("3. How do you declare a float variable in Java?");
        System.out.println("float value = 10.5f; // or 10.5F");
        System.out.println("4. Why is an 'f' or 'F' suffix required for float literals?");
        System.out.println("Answer: By default, Java treats decimal numbers as double. Adding f makes it a float.");
        System.out.println("5. What is the default value of a float variable?");
        System.out.println("Answer: 0.0f");
        System.out.println("6. Why is float not suitable for precise values like currency?");
        System.out.println("Answer: Due to floating-point rounding errors and limited precision. Use BigDecimal instead.");
        System.out.println("7. How do you compare two float values safely?");
        System.out.println("Answer: Use a small epsilon value.");
        System.out.println("8. What’s the difference between float and double in Java?");
        System.out.println("Feature\t\t\tfloat\t\t\tdouble");
        System.out.println("Size\t\t\t32-bit\t\t\t64-bit");
        System.out.println("Precision\t\t~7 digits\t\t~15 digits");
        System.out.println("Suffix\t\t\tf or F\t\t\toptional or d/D");
        System.out.println("Use Case\t\tMemory-constrained apps\t\tHigh precision needed");
    }
}
