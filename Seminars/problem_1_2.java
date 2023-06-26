/*
В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */


import java.util.Scanner;
import java.time.LocalDateTime;
public class problem_1_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String userName = iScanner.next();
        iScanner.close();
        int dataTime = LocalDateTime.now().getHour();

        if (dataTime >= 5 && dataTime < 12) {
            System.out.printf("Доброе утро, %s!", userName);
        }
        if (dataTime >= 12 && dataTime < 18) {
            System.out.printf("Добрый день, %s!", userName);
        }
        if (dataTime >= 18 && dataTime < 23) {
            System.out.printf("Добрый вечер, %s!", userName);
        }
        else {
            System.out.printf("Доброй ночи, %s!", userName);
        }
    }
}
