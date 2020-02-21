package jc01_2020.avramkov.lesson10.task01;

/*
 *
 * Заполнить произвольное множество строками. Вывести в консоль размер множества. Добавить строку, которая уже есть во
 * множестве. Убедиться, что размер не изменился
 *
 */

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Anna", 20);
        map.put("Mary", 18);
        map.put("Elza", 22);
        map.put("Bob", 25);
        map.put("Bill", 14);

        System.out.println(map.size());
        map.put("Anna", 20);
        System.out.println(map.size());
    }

}
