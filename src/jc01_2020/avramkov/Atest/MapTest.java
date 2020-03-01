package jc01_2020.avramkov.Atest;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 *
 * Заполнить карту записями вида "фамилия" - "имя". Вывести в консоль все пары значений. Удалить из карты все записи с
 * одинаковыми "именами" (если 2 и более человек имеют одинаковое имя, то удалить всех) и вывести в консоль оставшиеся записи.
 *
 */


public class MapTest {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Map<String, String> map = new TreeMap<>();
            for (int i = 0; i < 5; i++) {
                String surname = scanner.nextLine();
                String firstName = scanner.nextLine();
                map.put(surname, firstName);
            }


            Map<String, String> map1 = new TreeMap<>();
            for (Map.Entry<String, String> entry1 : map.entrySet()) {
                int count = 1; // 1 - значит, что пара уникальна
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    //если ключи разные,а значения совпадают.
                    if (!entry1.getKey().equals(entry2.getKey()) && entry1.getValue().equals(entry2.getValue())) {
                        map1.put(entry1.getKey(),entry1.getValue());
                    }
                }

            }



            System.out.println("Уникальные пары ключ-значение:");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

