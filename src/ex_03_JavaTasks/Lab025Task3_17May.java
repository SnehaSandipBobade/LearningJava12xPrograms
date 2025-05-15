package ex_03_JavaTasks;

public class Lab025Task3_17May {
    public static void main(String[] args) {
        System.out.println("Q3. Write a code for condition-  use the nested ternary. " +
                "You have to figure it out if I am an adult, minor, or senior. " +
                "What is the condition? The condition is very simple. If my age is greater than 18, then I can be minor or adult or senior." +
                " But if my age is greater than 65, then I am a senior. If I am between 18 to 65, then I am an adult. ");
        int age = 72;
        String res= age<18?"Minor" : (age<=65)?"Adult":"Senior";
        System.out.println("if person age ="+ age +" category is "+res);
    }
}
