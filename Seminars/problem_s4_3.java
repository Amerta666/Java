
// Написать метод, который принимает массив элементов, помещает их в стэк
//    и выводит на консоль содержимое стэка.
// Написать метод, который принимает массив элементов, помещает их в
//    очередь и выводит на консоль содержимое очереди.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class problem_s4_3 {
    public static void main(String[] args) {
        LinkedList<String> newLList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            newLList.add("java " + i);
        }
        System.out.println("Linked List");
        System.out.println(newLList);
        Stack<String> userStack = new Stack<>();
        for (String item: newLList) {
            userStack.push(item);
        }
        System.out.println("Stack");
        System.out.println(userStack);

        Queue<String> userQueue = new LinkedList<>();
        for (String item: newLList) {
            userQueue.add(item);
        }
        System.out.println("Queue");
        System.out.println(userQueue);
    }
}
