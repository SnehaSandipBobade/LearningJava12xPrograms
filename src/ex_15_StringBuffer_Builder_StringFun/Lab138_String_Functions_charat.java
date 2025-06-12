package ex_15_StringBuffer_Builder_StringFun;

public class Lab138_String_Functions_charat {
    public static void main(String[] args) {
        String name = "Sneha";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        //System.out.println(name.charAt(10));
        // 2. concat()
        System.out.println(name.concat("Sandip"));

        // 3. contains()
        System.out.println(name.contains("di"));

        // 4. equals()
        System.out.println(name.equals("Sneha"));


        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sneha"));

        // 6. indexOf() //  sneha -> ? a
        System.out.println(name.indexOf('a'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));

        // 10. substring( , )
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("Sneha".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sneha".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 16. trim()
        String name3 = "Sneha Sandip";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Kritvik"));


        StringBuilder stringBuilder = new StringBuilder("Savi");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());


        String anotherPalindrome = "Nira. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);


        String s11 = "SnehaSandip";
        String s21 = s11.concat("Bobade");
        System.out.println(s21);


    }
}
