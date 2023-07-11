
// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class problem_s5_2 {
    public static void main(String[] args) {
        String Example  = "{a}[+]{(d*3)}";
        System.out.println(Example);
        Map<Character, Integer> db = new HashMap<>();
        for (int i = 0; i < Example.length(); i++) {
            if (db.containsKey(Example.charAt(i))) {
                db.put(Example.charAt(i), db.get(Example.charAt(i)) + 1);
            }
            else {
                db.put(Example.charAt(i), 1);
            }
        }
        if ((Objects.equals(db.get('{'), db.get('}'))) && (db.get('(').equals(db.get(')')))
                && (db.get('[').equals(db.get(']')))){
            System.out.println("Запись верная");
        }
        else {
            System.out.println("Запись не верная");
        }


    }
}
