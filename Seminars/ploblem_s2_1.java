/*
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку, длины N, которая состоит
из чередующихся символов c1 и c2, начиная с c1.
 */

public class ploblem_s2_1 {
    public static void main(String[] args) {
        int N = 11;
        String firstSymbol = "c1";
        String secondSymbol = "c2";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N/2; i++) {
            sb.append(firstSymbol);
            sb.append(secondSymbol);
        }
        if (N % 2 != 0) {
            sb.append(firstSymbol);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
