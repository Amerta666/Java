
/*
Напишите метод, который вернет содержимое текущей папки в виде массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
Обработайте ошибки с помощью try-catch конструкции.
В случае возникновения исключения, оно должно записаться в лог-файл.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class problem_s2_5 {
    public static void main(String[] args) throws IOException {
        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("/Seminars");
        File dir = new File(pathDir);
        String filename = "Seminars/problem_s2_5.txt";
        System.out.println(dir.getAbsolutePath());
        for (String fname : dir.list()) {
            UserFileWriter(fname, filename);
        }
    }
    public static void UserFileWriter(String text, String filename) {
        try (FileWriter sb = new FileWriter(filename, true)) {
            sb.append(text).append("\n");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
