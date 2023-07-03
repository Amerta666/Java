/*
Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
String s1 = "hello";
String s2 = "hello";
String s3 = s1;
String s4 = "h" + "e" + "l" + "l" + "o";
String s5 = new String("hello");
String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
 */

import java.util.Arrays;

public class problem_s3_0 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(" == ");
        for (String s : Arrays.asList(s2, s3, s4, s5, s6)) {
            System.out.println(s1 == (s));
        }
        System.out.println("\nequals");
        for (String s : Arrays.asList(s2, s3, s4, s5, s6)) {
            System.out.println(s1.equals(s));
        }

    }

}