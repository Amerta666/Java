package hm_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lib {
    public static String[] ReadLine(String pathway) throws Exception {
        return getStrings(pathway);
    }

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

    public static String parse (String text) {
        String text1 = text.replace("{", "");
        String text2 = text1.replace("}", "");
        return text2.replace("\"", "");
    }
    public static StringBuilder LineText(String text) {
        StringBuilder result = new StringBuilder("select * from students where ");
        String text3 = lib.parse(text);
        String [] arrayData = text3.split(", ");
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            if(!arrData[1].equals("null")) {
                if (i != 0) {
                    result.append(", ").append(arrData[0]).append(" = ").append("\"").append(arrData[1]).append("\"");
                } else {
                    result.append(arrData[0]).append(" = ").append("\"").append(arrData[1]).append("\"");
                }
            }
        }
        return result;
    }

}