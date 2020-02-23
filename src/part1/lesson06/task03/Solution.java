package part1.lesson06.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//Метод возвращающий true, если в мапе нет двух и более одинаковых value, и false в противном случае
class Solution {
    static void main(String[] args) {
        Map<String, String> firstMap = new HashMap<String, String>();
        firstMap.put("Вася", "Иванов");
        firstMap.put("Петр", "Петров");
        firstMap.put("Виктор", "Сидоров");
        firstMap.put("Сергей", "Савельев");
        firstMap.put("Вадим", "Викторов");

//        for (Map.Entry<String, String> entry: firstMap.entrySet()) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }

        System.out.println(isUnique(firstMap));

        Map<String, String> secondMap = new HashMap<String, String>();
        secondMap.put("Вася", "Иванов");
        secondMap.put("Петр", "Петров");
        secondMap.put("Виктор", "Иванов");
        secondMap.put("Сергей", "Савельев");
        secondMap.put("Вадим", "Петров");

//        for (Map.Entry<String, String> entry: firstMap.entrySet()) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }

        System.out.println(isUnique(secondMap));

        Map<String, String> thirdMap = new HashMap<String, String>();
        System.out.println(isUnique(thirdMap));
    }

    private static boolean isUnique(Map<String, String> map) {
        HashSet<String> set = new HashSet<String>();

        for (String key : map.keySet()) {
            String value = map.get(key);

            if (set.contains(value))
                return false;

            set.add(value);
        }

        return true;
    }
}
