package hm_4;

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class lib {
    public static LinkedList<Integer> RandomList (LinkedList<Integer>List) {
        for (int i = 0; i < 9; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 20);
            List.add(randomNum);
        }
        return List;
    }

    public static LinkedList<Integer> FlippedList (LinkedList<Integer>List) {
        int last = List.size() - 1;
        for (int i = 0; i < List.size() / 2; i++) {
            int temp = List.get(i);
            List.set(i, List.get(last));
            List.set(last, temp);
            last -= 1;
        }
        return List;
    }

    public static LinkedList<Integer> enqueue (LinkedList<Integer>List, int x) {
        List.add(x);
        return List;
    }

    public static Integer dequeue (LinkedList<Integer>List) {
    return List.pop();
    }

    public static Integer first (LinkedList<Integer>List) {
        return List.get(0);
    }
}
