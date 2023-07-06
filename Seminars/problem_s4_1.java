


//Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

import java.util.LinkedList;
import java.util.Scanner;
public class problem_s4_1 {
    public static void main(String[] args) {
        LinkedList<String> text = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            text.add("Java " + i);
        }
        System.out.println(text);
        LinkedList<String> NewText = InputList(text);
        System.out.println(NewText);
    }
    public static LinkedList<String> InputList(LinkedList<String>List) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите text~num: ");
        String textNum = iScanner.nextLine();
        iScanner.close();

        String[] SplitTextNum = textNum.split("~");
        if (!SplitTextNum[0].equals("print")) {
            List.add(Integer.parseInt(SplitTextNum[1]), SplitTextNum[0]);
        }
        else {
            System.out.println(List.get(Integer.parseInt(SplitTextNum[1])));
            List.remove(Integer.parseInt(SplitTextNum[1]));
        }
        return List;
    }
}
