/*
4. *+Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
 */

package hm_1;
public class problem_4 {
    public static void main(String[] args) {
        String a = "5";
        String exp = "2? + ?5 = 69";
        exp = exp.replaceAll("[+=]", "").replaceAll("[?]", a);
        String [] arr = exp.split(" {2}");
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);
        int z = Integer.parseInt(arr[2]);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
<<<<<<< HEAD

=======
>>>>>>> java/master
