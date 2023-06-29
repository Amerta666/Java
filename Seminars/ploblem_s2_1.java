/*
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая состоит
из чередующихся символов c1 и c2, начиная с c1.
 */

public class ploblem_s2_1 {
    public static void main(String[] args) {
        int N = 111;
        String c1 = ":";
        String c2 = "=";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N/2; i++) {
            sb.append(c1);
            sb.append(c2);
        }
        if (N % 2 != 0) {
            sb.append(c1);
        }
        System.out.println(sb);
    }
}
