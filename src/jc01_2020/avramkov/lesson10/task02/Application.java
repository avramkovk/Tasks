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
//заполняем список рандомными значениями
        for (int i = 0; i < 20; i++) {
            map.put("a" + (int) (Math.random() * 100), (int) (Math.random() * 100));
        }
//создаем первый итератор, чтобы пройтись по множеству и удалить значения > 50
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() > 50) {
                iterator.remove();
            }
        }
//создаем второй итератор, чтобы вывести значения карты на экран
        Iterator<Map.Entry<String, Integer>> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Integer> entry2 = iterator2.next();
            System.out.println(entry2.getKey() + " - " + entry2.getValue());
        }
    }
}