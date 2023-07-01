/*
Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации:
Input:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Итоговый SQL-запрос должен выглядеть как:
Output
select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow"
*/

package hm_2;
public class problem_1 {
    public static void main(String[] args) throws Exception {
        String [] list = lib.ReadLine("HomeWork/hm_2/problem_1.txt");
        System.out.println(list[0]);
        StringBuilder resultSel = lib.LineText(list[0]);
        System.out.println(resultSel);
    }
}