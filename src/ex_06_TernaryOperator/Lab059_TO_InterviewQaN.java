package ex_06_TernaryOperator;

public class Lab059_TO_InterviewQaN {
    public static void main(String[] args) {


        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        System.out.println("Read and give answer what will be the o/p");
        int number = 21;
        String result = (number > 18) ? (number > 25 ? "In Goa, You can drink" : "You can't Drink") : "You can't go GOA";
        System.out.println(result);

    }
}
