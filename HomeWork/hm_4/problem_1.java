
//    Пусть дан LinkedList с несколькими элементами.
//    - Реализуйте метод, который вернет “перевернутый” список.
//    - Реализуйте очередь с помощью LinkedList со следующими методами:
//       enqueue() - помещает элемент в конец очереди,
//       dequeue() - возвращает первый элемент из очереди и удаляет его,
//       first() - возвращает первый элемент из очереди, не удаляя.


package hm_4;

import java.util.LinkedList;


public class problem_1 {
    public static void main(String[] args) {
        LinkedList<Integer> Llist = new LinkedList<>();
        int enq = 99;
        System.out.print("Начальный список - ");
        System.out.println(lib.RandomList(Llist));
        System.out.print("Перевёрнутый список - ");
        System.out.println(lib.FlippedList(Llist));
        System.out.print("enqueue() - ");
        System.out.println(lib.enqueue(Llist, enq));
        System.out.print("dequeue() - ");
        System.out.println(lib.dequeue(Llist));
        System.out.print("dequeue() - ");
        System.out.println(Llist);
        System.out.print("first() - ");
        System.out.println(lib.first(Llist));
        System.out.print("first() - ");
        System.out.println(Llist);









    }

}
