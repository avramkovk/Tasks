package jc01_2020.avramkov.lesson03;

/*
 *
 * Сформировать из введенного числа обратное по порядку входящих в него цифр и вывести на экран.
 * Например, если введено число 3486, то надо вывести число 6843.
 *
 * Формат вывода (ошибки недопустимы):
 * одно число с учетом знака
 *
 */

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long input = scanner.nextLong();


		if (input > 0) {
			while (input > 0) {
				int currentDigit = (int) (input % 10);
				System.out.print(currentDigit);
				input = input / 10;
				}
			} else if (input < 0){
			System.out.print("-");
			input = -1* input;
			while (input > 0) {
				int currentDigit = (int) (input % 10);
				System.out.print(currentDigit);
				input = input / 10;
			}
		} else if (input == 0){
			System.out.println("0");
		}
	}
}
