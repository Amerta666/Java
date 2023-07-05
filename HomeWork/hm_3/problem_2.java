
// Реализовать алгоритм сортировки слиянием

package hm_3;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class problem_2 {
    public static void main(String[] args) {
        int[] randomArray = new int[25];
        for (int i = 0; i < randomArray.length; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(-5, 35);
            randomArray[i] = randomNum;
        }

        int[] result = mergeSort(randomArray);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        return mergeSortInner(buffer1, buffer2, 0, array1.length);
    }
    public static int[] mergeSortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}