package Lecture_2;

public class String_1 {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            //str += "+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
    }
}
