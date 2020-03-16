package jc01_2020.avramkov.lesson10.task01;

/*
 *
 * Заполнить произвольное множество строками. Вывести в консоль размер множества. Добавить строку, которая уже есть во
 * множестве. Убедиться, что размер не изменился
 *
 */

import java.util.*;

public class Application {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Arrays.asList("A","B","C","D"));

        System.out.println(set.size());
        set.add("A");
        System.out.println(set.size());
    }

}
