// Реализовать алгоритм сортировки слиянием (MergeSort).

package hm_5;

import java.util.Arrays;
import java.util.Random;

public class problem_3 {

    public static int left(int i) {
        return (2*i + 1);
    }

    public static int right(int i) {
        return (2*i + 2);
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void heapify(int[] arr, int i, int size) {
        int left = left(i);
        int right = right(i);

        int largest = i;

        if (left < size && arr[left] > arr[i]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, size);
        }
    }

    public static int pop(int[] arr, int size) {

        if (size <= 0) {
            return -1;
        }
        int top = arr[0];
        arr[0] = arr[size-1];
        heapify(arr, 0, size - 1);
        return top;
    }

    public static void heapsort(int[] arr) {

        int n = arr.length;
        int i = (n - 2) / 2;
        while (i >= 0) {
            heapify(arr, i--, n);
        }

        while (n > 0) {
            arr[n - 1] = pop(arr, n);
            n--;
        }
    }

    public static void main(String[] args) {
        Random rd = new Random();
        int[] list = new int[16];

        for (int i = 0; i < list.length; i++) {
            list[i] = rd.nextInt(1, 25);
        }
        System.out.print("   До сортировки - ");
        System.out.println(Arrays.toString(list));
        heapsort(list);
        System.out.print("После сортировки - ");
        System.out.println(Arrays.toString(list));
    }
}
