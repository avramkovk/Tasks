package jc01_2020.avramkov.lesson09.task06;

/*
 *
 * Создать и заполнить любыми числами два списка: обычный и связанный. Размер списков - 1 млн элементов.
 * В каждый список добавить 100_000 раз в нулевую позицию значение 0. Вывести в консоль длительности вставки 100_000
 * элементов для обычного и связанного списков.
 *
 * N.B. Поищите сами как засечь время.
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {

//_______________________________________________________ArrayList
		ArrayList<Double> arrayList = new ArrayList<>();

long time1ArrayList = System.currentTimeMillis();

		for (int i = 0; i < 1_000_000; i++) {
			arrayList.add(Math.random());
		}

		for (int i = 0; i < 100_000; i++) {
			arrayList.add(0,0d);
		}

		long time2ArrayList = System.currentTimeMillis();

		long timeResultArray = time2ArrayList - time1ArrayList;
		System.out.println("ArrayList " + timeResultArray);

		//_______________________________________________________LinkedList
		LinkedList<Double> linkedList = new LinkedList<>();

		long time1LinkedList = System.currentTimeMillis();

		for (int i = 0; i < 1_000_000; i++) {
			arrayList.add(Math.random());
		}

		for (int i = 0; i < 100_000; i++) {
			linkedList.addFirst(0d);
		}

		long time2LinkedList = System.currentTimeMillis();

		long timeResultLinked = time2LinkedList - time1LinkedList;
		System.out.println("LinkedList " + timeResultLinked);
	}

}
