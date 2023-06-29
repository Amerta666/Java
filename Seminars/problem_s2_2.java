/*
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
 */

import java.util.Arrays;

public class problem_s2_2 {
    public static void main(String[] args) {
        String string = "aaaabbbcdd";
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        //System.out.println(sortedString);
        String text = sortedString;
        StringBuilder sb = new StringBuilder();
        String [] array = new String[]{text};
        int count = 1;
        for (int i = 1; i < array.length;i++) {
            System.out.print(array[i]);
            if (array[i] == array[i - 1]) {
                count += 1;
            }
            else {
                sb.append(count + array[i]);
                count = 1;
            }
            //System.out.println(sb);
        }
    }
}