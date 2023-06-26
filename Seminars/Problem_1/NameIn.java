package Problem_1;

import java.util.Scanner;
public class NameIn {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();
        iScanner.close();
    }
}
