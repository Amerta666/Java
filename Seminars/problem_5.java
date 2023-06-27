/*
Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
 */


//import java.util.Arrays;

public class problem_5 {
    public static void main(String[] args) {
        String WelcomeJava = "Добро пожаловать на курс по Java";
        String[] arr = WelcomeJava.split(" ");
        //System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }
    }
}
