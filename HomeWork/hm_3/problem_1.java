
//Пусть дан произвольный список целых чисел.
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение

package hm_3;

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
        int summ = 0;
        System.out.println(randomNumbers);

        for (int i = 0; i < randomNumbers.size(); i++) {
            if (i % 2 == 0) {
                randomNumbers.remove(i);
            }
        }
        for (int item : randomNumbers) {
            summ += item;
        }

        System.out.print("Без чётных чисел - ");
        System.out.println(randomNumbers);
        System.out.print("Минимальное значение - ");
        System.out.println(Collections.min(randomNumbers));
        System.out.print("Максимальное значение - ");
        System.out.println(Collections.max(randomNumbers));
        System.out.print("Среднее значение - ");
        System.out.print(summ / randomNumbers.size());
    }
}
