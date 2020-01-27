package jc01_2020.avramkov.lesson03;

/*
 *
 * Вывести на экран "прямоугольник", образованный из двух видов символов.
 * Контур прямоугольника должен состоять из одного символа, а "заливка" - из другого.
 *
 * Теста нет, смотрим вывод в консоль
 *
 */

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int horizontal = scanner.nextInt();
		int vertical = scanner.nextInt();

		for (int i = 0; i < horizontal; i++) {
			System.out.print("+");
			for (int j = 0; j < vertical; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
//        System.out.print("");
//        System.out.println("");
	}
}
