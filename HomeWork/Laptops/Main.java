package Laptops;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptops laptop1 = new Laptops("Machenike S16", 8, 512, "Windows 11", "Чёрный");
        Laptops laptop2 = new Laptops("Colorful X15 XS", 16, 512, "Windows 11", "Чёрный" );
        Laptops laptop3 = new Laptops("Acer Nitro 5", 16, 512, "Без ОС", "Чёрный");
        Laptops laptop4 = new Laptops("ASUS ROG Strix G614", 16, 1024, "Windows 11", "Белый");
        Laptops laptop5 = new Laptops("Apple MacBook Air", 8, 256, "macOS", "Серый");
        Laptops laptop6 = new Laptops("MSI Crosshair 15 C12VG", 16, 1024, "Без ОС", "Красный" );
        Laptops laptop7 = new Laptops("MSI Raider GE78 HX", 32, 2048, "Windows 11", "Белый");
        Laptops laptop8 = new Laptops("Irbis MB 283", 4, 128, "Windows 10", "Чёрный" );
        Laptops laptop9 = new Laptops("HP 270 G7", 4, 128, "Без ОС", "Белый");
        Laptops laptop10 = new Laptops("Apple MacBook Air", 8, 256, "macOS", "Чёрный");

        HashSet<Laptops> unicLaptops = new HashSet<>();
        unicLaptops.add(laptop1);
        unicLaptops.add(laptop2);
        unicLaptops.add(laptop3);
        unicLaptops.add(laptop4);
        unicLaptops.add(laptop5);
        unicLaptops.add(laptop6);
        unicLaptops.add(laptop7);
        unicLaptops.add(laptop8);
        unicLaptops.add(laptop9);
        unicLaptops.add(laptop10);

        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите характеристики: ");
        System.out.println("1. Объем оперативной памяти: ");
        int ramUser = scan.nextInt();
        System.out.println("2. Объем жёсткого диска: ");
        int hddUser = scan.nextInt();
        System.out.println("3. Операционная система: ");
        String osUser = scan.next();
        System.out.println("4. Цвет: ");
        String colourUser = scan.next();

        for(Laptops lap: unicLaptops) {
            if ((lap.getRam() >= ramUser) && (lap.getHDD() >= hddUser && (Objects.equals(lap.getOS(), osUser))) && (Objects.equals(lap.getColour(), colourUser))) {
                System.out.println(lap);
            }
        }
        scan.close();
    }
}
