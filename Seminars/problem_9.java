import java.io.FileWriter; // Импорт файлрайтера
import java.io.IOException;
public class problem_9 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {        // Обработка ошибки(если есть) и её вывод
            System.out.println(ex.getMessage());
        }
    } }