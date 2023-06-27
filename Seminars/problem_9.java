/*
Записать в файл следующие данные:

Name Surname Age
Kate Smith 20
Paul Green 25
Mike Black 23

 */


import java.io.FileWriter;
import java.io.IOException;
public class problem_9 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("Seminars/problem_9.txt", false)) {
            fw.append('\n');
            fw.write("Name Surname Age");
            fw.append('\n');
            fw.write("Kate Smith 20");
            fw.append('\n');
            fw.write("Paul Green 25");
            fw.append('\n');
            fw.write("Mike Black 23");
            fw.flush();
        } catch (IOException ex) {        // Обработка ошибки(если есть) и её вывод
            System.out.println(ex.getMessage());
        }
    } }