package jc01_2020.avramkov.lesson12;

/*
 *
 * Создать карту вида "фамилия"-"имя" из 20 элементов. Длина и фамилии, и имени от 5 до 10 символов
 * 1) Вывести в консоль все значения карты
 * 2) переписать все значения как имя + фамилия
 * 3) оставить в стриме все имена, которые не длиннее 16 символов
 * 4) Вывести в консоль самое длинное имя
 *
 */

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();
        map.put("Юрьев", "Юрий");
        map.put("Петров", "Петр");
        map.put("Иванов", "Иван");
        map.put("Павлов", "Павел");
        map.put("Сидоров", "Сидор");
        map.put("Борисов", "Борис");
        map.put("Романов", "Роман");
        map.put("Сергеев", "Сергей");
        map.put("Платонов", "Платон");
        map.put("Леонтьев", "Леонтий");
        map.put("Савельев", "Савелий");
        map.put("Игнатьев", "Игнатий");
        map.put("Дмитриев", "Дмитрий");
        map.put("Филлиппов", "Филипп");
        map.put("Артемьев", "Артемий");
        map.put("Евгеньева", "Евгения");
        map.put("Григорьев", "Григорий");
        map.put("Геннадьев", "Геннадий");
        map.put("Валерьянов", "Валерий");
        map.put("Владимиров", "Владимир");

/*        for (Map.Entry<String, String> entry : map.entrySet()) {
        	//длина строк
            System.out.println(entry.getKey() + entry.getValue() + "=" + (entry.getKey().length() + entry.getValue().length()));
        }*/

        map.entrySet()
                .stream()
                .peek(x -> x.setValue(x.getKey() + x.getValue()))
                .map(Map.Entry::getValue)
                .filter(s -> s.length() <= 16)
                .max(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);

    }
}

/*map.replaceAll((key,value) -> value+key);

		Map<String, String> collect = map.entrySet()
				.stream()
				.filter(x -> x.getValue().length() < 16)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		List<String> list = new ArrayList<>();
		for(Map.Entry<String,String> s: collect.entrySet()){
			list.add(s.getValue());
		}

		String longName = Collections.max(list, Comparator.comparingInt(String::length));
		System.out.println("longName = " + longName);*/