package Lecture_4;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        int minNumb = 0;
        int maxNumb = 50;
        int count = 15;
        Random random = new Random();
        List<Integer> randomNumbers = random.ints(minNumb, maxNumb).distinct().limit(count).boxed().collect(Collectors.toList());
        System.out.println(randomNumbers);

        for (int i = 0; i < randomNumbers.size(); i++) {
            if (i % 2 == 0) {
                randomNumbers.remove(i);
            }
        }

        System.out.print("Без чётных чисел - ");
        System.out.println(randomNumbers);

    }
}
