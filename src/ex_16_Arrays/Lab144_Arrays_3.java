package ex_16_Arrays;

public class Lab144_Arrays_3 {
    public static void main(String[] args) {
        String[] names =  {"sneha","sandip","kritvik"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]);

        String[] name_atb12x = new String[3];
        name_atb12x[0] = "jay";
        name_atb12x[1] = "devika";
        name_atb12x[2] = "shweta";

        System.out.println(name_atb12x.length);
        System.out.println(name_atb12x[0]);
        System.out.println(name_atb12x[2]);
        System.out.println(name_atb12x[1]);

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] =  true;
        is_male_data[1] =  false;
    }
}
