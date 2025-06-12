package ex_09_Switch;

public class Lab095_Interview_guess_output {
    public static void main(String[] args) {
        System.out.println("Guess output :");
        int a = 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }

        char code = 'C';
        switch (code){
            default:
                System.out.println("Hellooooooo");
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }

    }
}
