package Problem_1;

import java.util.Scanner;
    public class GetName {
        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите имя: ");
            String name = iScanner.nextLine();
            System.out.printf("Привет, %s!", name);
            iScanner.close();
    }
}