/*
- Замерьте время, за которое в ArrayList добавятся 10000 элементов.
- Замерьте время, за которое в LinkedList добавятся 10000 элементов.
  Сравните с предыдущим.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class problem_s4_0 {
    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<>();
        double startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 20);
            randomList.add(randomNum);
        }
        double endTime = System.nanoTime();
        double duration = (endTime - startTime);
        System.out.println("ArrayList");
        System.out.print("сек - ");
        System.out.println(duration / 100000000);

        LinkedList<Integer> randomLinkedList = new LinkedList<>();
        double startTimeLinked = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int randomNumLinked = ThreadLocalRandom.current().nextInt(0, 20);
            randomLinkedList.add(randomNumLinked);
        }
        double endTimeLinked = System.nanoTime();
        double durationLinked = (endTimeLinked - startTimeLinked);
        System.out.println("LinkedList");
        System.out.print("сек - ");
        System.out.print(durationLinked / 100000000);

    }
}
