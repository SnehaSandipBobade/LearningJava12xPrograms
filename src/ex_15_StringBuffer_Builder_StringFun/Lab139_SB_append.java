package ex_15_StringBuffer_Builder_StringFun;

public class Lab139_SB_append {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Sneha");
        stringBuffer.append("Sandip");
        System.out.println(stringBuffer);

        String s1 = "Kritvik";
        s1 = s1+ "Bobade";
        System.out.println(s1);
    }
}
