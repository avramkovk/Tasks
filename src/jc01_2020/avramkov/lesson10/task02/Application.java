package jc01_2020.avramkov.lesson10.task02;

/*
 *
 * Заполнить множество случайными числами от 0 до 100. Удалить все числа, которые больше 50. Результат вывести в консоль.
 * Используйте Iterator
 *
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Application {


    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        String value = "a" + (int) (Math.random() * 100);
        for (int i = 0; i < 20; i++) {
            map.put(value, (int) (Math.random() * 100));
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() > 50) {
                iterator.remove();
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
