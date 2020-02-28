package jc01_2020.avramkov.lesson10.task04;

/*
 *
 * Заполнить карту записями вида "фамилия" - "имя". Вывести в консоль все пары значений. Удалить из карты все записи с
 * одинаковыми "именами" (если 2 и более человек имеют одинаковое имя, то удалить всех) и вывести в консоль оставшиеся записи.
 *
 */

import java.util.*;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new TreeMap<>();
        for (int i = 0; i < 5; i++) {
            String surname = scanner.nextLine();
            String firstName = scanner.nextLine();
            map.put(surname, firstName);
        }

        ArrayList<String> array = new ArrayList<>(); //для сбора ключей со значениями-дубликатами

        for (Map.Entry<String, String> entry1 : map.entrySet()) {
            int count = 1; // 1 - значит, что пара уникальна
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                //если ключи разные,а значения совпадают.
                if (!entry1.getKey().equals(entry2.getKey()) && entry1.getValue().equals(entry2.getValue())) {
                    count++;
                }
            }
            if (count != 1) array.add(entry1.getKey());//если совпадений больше 1, то добавить влюч в Эрэйлист
        }

        System.out.println("Значения ключей пар с одинаковыми именами " +array);
        for (String arr : array) {
            map.remove(arr); //если значение в Эрэйлист совпадает с ключом в Мапе, то удалить этот ключ из Мапы
        }

        System.out.println("Уникальные пары ключ-значение:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

