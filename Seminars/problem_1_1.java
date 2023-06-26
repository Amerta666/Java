/*
В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */


import java.util.Scanner;
import java.time.LocalDateTime;
public class problem_1_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String userName = iScanner.next();
        iScanner.close();
        int dataTime = LocalDateTime.now().getHour();
        switch (dataTime) {
            case 5, 6, 7, 8, 9, 10, 11 -> System.out.printf("Доброе утро, %s!", userName);
            case 12, 13, 14, 15, 16, 17 -> System.out.printf("Добрый день, %s!", userName);
            case 18, 19, 20, 21, 22 -> System.out.printf("Добрый вечер, %s!", userName);
            case 23, 0, 1, 2, 3, 4 -> System.out.printf("Доброй ночи, %s!", userName);
        }
    }
}