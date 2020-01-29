package jc01_2020.avramkov.lesson03;

/*
 *
 * Вывести на экран таблицу умножения (от 1 до 9)
 *
 * Теста нет, смотрим вывод в консоль
 *
 */

public class Task8 {
	public static void main(String[] args) {
//        System.out.println("");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <=9 ; j++) {
				System.out.println(i + "*" + j + " = " + i*j);

			}

		}
	}
}
