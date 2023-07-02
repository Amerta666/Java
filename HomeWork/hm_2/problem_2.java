/*
2) Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл.
 */

package hm_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class problem_2 {
    public static void main(String[] args) throws IOException {
        int[] Array = new int[] {1, 25, 10, 50, 7, 14, 5, 56, 71, 4};
        int[] SortedArray = Array.clone();
        Logger logger = Logger.getLogger(problem_2.class.getName());
        FileHandler fh = new FileHandler("HomeWork/hm_2/problem_2.xml");
        logger.setLevel(Level.INFO);
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Исходный массив - " + Arrays.toString(Array));
        for (int i = 0; i < SortedArray.length - 1; i++) {
            for (int j = 0; j < SortedArray.length - i - 1; j++) {
                if (SortedArray[j] > SortedArray[j + 1]) {
                    int temp = SortedArray[j];
                    SortedArray[j] = SortedArray[j + 1];
                    SortedArray[j + 1] = temp;
                }
            }
            logger.info("Промежуточный результат на " + (i + 1) + "-й итерации: - " + Arrays.toString(SortedArray));
        }
        logger.info("Отсортированный массив - " + Arrays.toString(SortedArray));
    }
}
