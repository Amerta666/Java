

//  Заполнить список десятью случайными числами.
//  Отсортировать список методом sort() и вывести его на экран.

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class problem_s3_1 {
    public static void main(String[] args) {
        int[] arrRandom = new int[10];
        for (int i = 0; i < arrRandom.length; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
            arrRandom[i] = randomNum;
        }
        System.out.println(Arrays.toString(arrRandom));
        IntStream arrRandomSorted = Arrays.stream(arrRandom).sorted();
        System.out.println(Arrays.toString(arrRandomSorted.toArray()));
    }
}
