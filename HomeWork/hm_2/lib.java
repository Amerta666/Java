package hm_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lib {
    public static String[] ReadLine(String pathway) throws Exception {
        return getStrings(pathway);
    }

    // Чтение из файла
    public static String[] getStrings(String pathway) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while (br.readLine() != null) {
            size += 1;
        }
        br.close();
        String[] listData = new String[size];

        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1;
        }
        br1.close();
        return listData;
    }

    //Парсинг строки
    public static String parse (String text) {
        String text1 = text.replace("{", "");
        String text2 = text1.replace("}", "");
        return text2.replace("\"", "");
    }

    // Создание SQL запроса
    public static StringBuilder LineText(String text) {
        StringBuilder result = new StringBuilder("select * from students where ");
        String text3 = lib.parse(text);
        String [] arrText = text3.split(", ");
        for (int i =0; i < arrText.length; i++) {
            String[] arrT = arrText[i].split(":");
            if(!arrT[1].equals("null")) {
                if (i != 0) {
                    result.append(", ").append(arrT[0]).append(" = ").append("\"").append(arrT[1]).append("\"");
                } else {
                    result.append(arrT[0]).append(" = ").append("\"").append(arrT[1]).append("\"");
                }
            }
        }
        return result;
    }


    // Сортировка массива пузырьком
    public static int[] SortArray (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
