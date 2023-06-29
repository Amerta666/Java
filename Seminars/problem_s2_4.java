/*
Напишите метод, который составит строку, состоящую из 100 повторений слова
TEST и метод, который запишет эту строку в простой текстовый файл,
обработайте исключения.
 */

import java.io.FileWriter;
import java.io.IOException;

public class problem_s2_4 {
    public static void main(String[] args) throws IOException {
        String word = "TEST";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(word + " ");
        }
        System.out.print(sb);
        try (FileWriter fw = new FileWriter("Seminars/problem_s2_4.txt", false)) {
            fw.write(String.valueOf(sb));                                   // false - нет
        }
    }
}
