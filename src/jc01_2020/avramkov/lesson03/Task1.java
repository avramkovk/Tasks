package jc01_2020.avramkov.lesson03;

/*
 *
 * С клавиатуры вводится натуральное число. Найти его наибольшую цифру
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 *
 */

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long input = scanner.nextLong();

		int maxDigit = (int) (input % 10);
		if (input > 0) {
			while (input > 0) {
				int currentDigit = (int) (input % 10);
				if (currentDigit > maxDigit) {
					maxDigit = currentDigit;
				}
				input = input / 10;
			}
		} else if (input < 0) {
			input = -1 * input;
			while (input > 0) {
			int currentDigit = (int) (input % 10);
			if (currentDigit > maxDigit) {
				maxDigit = currentDigit;
			}
			input = input / 10;
		}
	}
		System.out.println(maxDigit);
	}
}