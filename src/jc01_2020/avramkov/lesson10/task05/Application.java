package jc01_2020.avramkov.lesson10.task05;

/*
 *
 * Считать из консоли информацию вида "Покупатель товар количество", где Покупатель — имя покупателя (строка без пробелов),
 * товар — название товара (строка без пробелов), количество — количество приобретенных единиц товара. Сохранить эти
 * данные в карту. Имена покупателей и товаров уникальные. Для каждого покупателя вывести в консоль следующую информацию:
 * "Имя:
 * товар - общее купленное количество этого товара"
 *
 * Вся выходная информация должна быть отсортирована в алфавитном порядке
 *
 */


import java.util.*;

public class Application {

	public static void main(String[] args) {
		// Объявить список
		Scanner scanner = new Scanner(System.in);
		TreeMap<String, ArrayList<String>> map = new TreeMap<>();
		for (int i = 0; i < 5; i++) {
			// Заполнить список
			String man = scanner.next();
			String product = scanner.next();
			String quantity = scanner.next();
			map.put(man,new ArrayList<>(Arrays.asList(product,quantity)));
		}

		for(Map.Entry<String,ArrayList<String>> entry: map.entrySet()){
			System.out.println(entry.getKey() + ":");
			System.out.print(entry.getValue().get(0) + ", " + entry.getValue().get(1));
		}

	}

}
