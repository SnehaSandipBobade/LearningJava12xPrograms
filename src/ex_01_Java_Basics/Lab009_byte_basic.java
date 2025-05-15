package ex_01_Java_Basics;

public class Lab009_byte_basic {
    public static void main(String[] args) {
        System.out.println("1. What is the size of a byte in Java?");
        System.out.println("Answer: 8 bits (1 byte). It has a range from -128 to 127.");
        System.out.println("2. Why is the range of a byte in Java -128 to 127");
        System.out.println("Answer: Because Java uses two's complement representation for signed numbers.");
        System.out.println("3. Is byte a signed or unsigned data type in Java?");
        System.out.println("Answer: It is signed.");
        System.out.println("4. Can you assign a value 200 to a byte variable? Why or why not?");
        System.out.println("Answer: No. byte can only hold values from -128 to 127. 200 will cause " +
                "a compilation error unless explicitly cast, which may cause overflow.");
        System.out.println("5. What happens if you add two byte values? What will be the result type?");
        System.out.println("Answer: The result will be promoted to int, not byte.");


    }
}
