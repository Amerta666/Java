/*
1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
n! (произведение чисел от 1 до n)
 */


package hm_1;
import java.util.Scanner;
public class problem_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите 'n': ");
        int n = iScanner.nextInt();
        iScanner.close();
        int fact = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            fact *= i;
        }
        System.out.printf("n-ое треугольное - %s",sum);
        System.out.println();
        System.out.printf("n! - %s",fact);

    }
}
