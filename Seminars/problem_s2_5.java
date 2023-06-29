import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class problem_s2_5 {
    public static void main(String[] args) throws IOException {
        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("/Seminars");
        File dir = new File(pathDir);
        StringBuilder sb = new StringBuilder();
        System.out.println(dir.getAbsolutePath());
        for (String fname : dir.list()) {
            sb.append(fname).append("\n");
            System.out.println(fname);
        }
        try (FileWriter fw = new FileWriter("Seminars/problem_s2_5.txt", false)) {
            fw.write(String.valueOf(sb));
        }
        catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
