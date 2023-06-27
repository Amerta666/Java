/*
2. Вывести все простые числа от 1 до 1000
 */

package hm_1;

public class problem_2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            Integer rezult = i;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    rezult = null;
                    break;
                }
            }
            if (rezult != null) {
                System.out.println(rezult);
            }
        }
    }
}