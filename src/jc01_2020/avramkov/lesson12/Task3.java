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

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("Петров", "Петр");
		map.put("Иванов", "Иван");
		map.put("Сидоров", "Сидор");
		map.put("Павлов", "Павел");
		map.put("Валерьянов", "Валерий");
		map.put("Леонтьев", "Леонтий");
		map.put("Савельев", "Савелий");
		map.put("Игнатьев", "Игнатий");
		map.put("Борисов", "Борис");
		map.put("Дмитриев", "Дмитрий");
		map.put("Геннадьев", "Геннадий");
		map.put("Филлиппов", "Филипп");
		map.put("Артемьев", "Артемий");
		map.put("Владимиров", "Владимир");
		map.put("Юрьев", "Юрий");
		map.put("Платонов", "Платон");
		map.put("Евгеньев", "Евгений");
		map.put("Григорьев", "Григорий");
		map.put("Романов", "Роман");
		map.put("Сергеев", "Сергей");

		map.replaceAll((key,value) -> value+key);

		Map<String, String> collect = map.entrySet()
				.stream()
				.filter(x -> x.getValue().length() < 16)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		List<String> list = new ArrayList<>();
		for(Map.Entry<String,String> s: collect.entrySet()){
			list.add(s.getValue());
		}

		String longName = Collections.max(list, Comparator.comparingInt(String::length));
		System.out.println("longName = " + longName);

	}
}
