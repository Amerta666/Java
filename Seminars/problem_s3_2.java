
//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.
//Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class problem_s3_2 {
    public static void main(String[] args) {
        ArrayList<String> PlanetList = new ArrayList<>(Arrays.asList("Меркурий", "Венера", "Земля", "Юпитер", "Сатурн", "Уран", "Марс",
                "Нептун", "Венера", "Сатурн", "Уран", "Земля", "Юпитер", "Нептун"));
        System.out.println(PlanetList);
        PlanetList.sort(null);
        System.out.println(PlanetList);
        int count = 0;
        String planet = PlanetList.get(0);
        for (String item: PlanetList) {
            if (!Objects.equals(item, planet)) {
                //System.out.println(planet + " - " + count);
                count = 1;
            }
            else {
                count += 1;
            }
            planet = item;
        }
        //System.out.println(planet + " - " + count);
        ArrayList<String> PlanetListUnic = new ArrayList<>();
        planet = "";
        for (String item: PlanetList) {
            if (!Objects.equals(item, planet)) {
                PlanetListUnic.add(item);
            }
            planet = item;
        }
        System.out.println(PlanetListUnic);

    }
}
