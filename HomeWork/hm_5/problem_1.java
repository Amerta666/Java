
//Реализуйте структуру телефонной книги с помощью HashMap,
//учитывая, что 1 человек может иметь несколько телефонов.

package hm_5;

import java.util.HashMap;
import java.util.Map;

public class problem_1 {
    public static void main(String[] args) {
        Map<String, int[]> PhoneBook = new HashMap<>();
        PhoneBook.put("Иванов", new int[]{456496, 4514531, 4534531});
        PhoneBook.put("Петров", new int[]{456486, 4564531});
        PhoneBook.put("Сидоров", new int[]{456486});
        PhoneBook.put("Петрова", new int[]{456486});
        for (var item : PhoneBook.entrySet()) {
            StringBuilder phones = new StringBuilder();
            for (int i : item.getValue()) {
                phones.append(i).append(" ");
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}

