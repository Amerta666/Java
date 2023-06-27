/*
Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
 */


//import java.util.Arrays;

public class problem_5_1 {
    public static void main(String[] args) {
        String WelcomeJava = "Добро пожаловать на курс по Java";
        String[] arr = WelcomeJava.split(" ");
        //System.out.println(Arrays.toString(arr));
        for (String item: arr) {
            System.out.print(item + " ");
        }
    }
}