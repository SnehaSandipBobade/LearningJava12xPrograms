package ex_04_Java_Operator;

public class Lab040_InterviewQaN {
    public static void main(String[] args) {
        System.out.println("what will be the output?");
        int Empsalary = 12;
        boolean b = !(Empsalary > 10 || Empsalary < 5);
        System.out.println(b);

        // A - balaji_salary > 10 -> 12 > 10 -> true
        // B -> balaji_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false




    }
}
