package ex_15_StringBuffer_Builder_StringFun;

public class Lab141_SB_AppendText {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sandip");
        sb.append("Bobade"); // Appends text
        sb.reverse();
        System.out.println(sb);
    }
}
