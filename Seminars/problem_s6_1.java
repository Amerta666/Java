
// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
//   уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.


import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;

public class problem_s6_1 {
    public static void main(String[] args) {
        int[] arrRandom = new int[1000];
        for (int i = 0; i < arrRandom.length; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 60);
            arrRandom[i] = randomNum;
        }
        System.out.print("Начальный массив - ");
        System.out.println(Arrays.toString(arrRandom));

        System.out.print("Процент уникальных чисел - ");
        System.out.print(percentUnickness(arrRandom));
        System.out.println(" %");

    }
    public static float percentUnickness (int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int item: arr) {
            hashSet.add(item);
        }
        return (float) (hashSet.size() * 100 / (float)arr.length);
    }
}
