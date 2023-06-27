/*
3. Реализовать простой калькулятор
 */


package hm_1;
import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNum = iScanner.nextInt();
        System.out.print("Введите операцию(+ - / *): ");
        char operation;
        operation = iScanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        int secondNum = iScanner.nextInt();
        iScanner.close();
        double rezuls;
        if (operation == '+') {
            rezuls = firstNum + secondNum;
            System.out.printf("%d + %d = %.0f", firstNum, secondNum, rezuls);
        }
        else if (operation == '-') {
            rezuls = firstNum - secondNum;
            System.out.printf("%d - %d = %.0f", firstNum, secondNum, rezuls);
        }
        else if (operation == '*') {
            rezuls = firstNum * secondNum;
            System.out.printf("%d * %d = %.0f", firstNum, secondNum, rezuls);
        }
        else if (operation == '/') {
            rezuls = (double) firstNum / secondNum;
            System.out.printf("%d / %d = %.2f", firstNum, secondNum, rezuls);
        }
    }
}