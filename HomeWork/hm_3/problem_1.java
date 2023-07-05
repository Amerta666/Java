
//Пусть дан произвольный список целых чисел.
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение

package hm_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class problem_1 {
    public static void main(String[] args) {
        int minNumb = 0;
        int maxNumb = 50;
        int count = 15;
        Random random = new Random();
        List<Integer> randomNumbers = random.ints(minNumb, maxNumb).distinct().limit(count).boxed().collect(Collectors.toList());
        ArrayList<Integer> list1 = new ArrayList<>();
        int summ = 0;
        System.out.println(randomNumbers);

        for (int item : randomNumbers) {
            if (item % 2 != 0) {
                list1.add(item);
                summ += item;
            }
        }
        System.out.print("Без чётных чисел - ");
        System.out.println(list1);
        System.out.print("Минимальное значение - ");
        System.out.println(Collections.min(list1));
        System.out.print("Максимальное значение - ");
        System.out.println(Collections.max(list1));
        System.out.print("Среднее значение - ");
        System.out.print(summ / list1.size());
    }
}
