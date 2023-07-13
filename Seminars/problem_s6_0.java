
// Создайте HashSet, заполните его следующими числами: {3, 4, 1, 2, 2, 5, 6, 3}.
// Распечатайте содержимое данного множества.
// Создайте LinkedHashSet, заполните его следующими числами: {3, 4, 1, 2, 2, 5, 6, 3}.
// Распечатайте содержимое данного множества.
// Создайте TreeSet, заполните его следующими числами: {3, 4, 1, 2, 2, 5, 6, 3}.
// Распечатайте содержимое данного множества.

import java.util.*;

public class problem_s6_0 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(3, 4, 1, 2, 2, 5, 6, 3));
        System.out.println(hashSet);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(3, 4, 1, 2, 2, 5, 6, 3));
        System.out.println(linkedHashSet);
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(3, 4, 1, 2, 2, 5, 6, 3));
        System.out.println(treeSet);
    }
}
