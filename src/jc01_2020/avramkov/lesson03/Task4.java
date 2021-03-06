package jc01_2020.avramkov.lesson03;

/*
 *
 * Вычислить факториал введенного числа. n >= 0 (0! = 1)
 * n! = 1 * 2 * 3 * 4 * ... * n
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 */

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeric = scanner.nextInt();

				int factorial = 1;
		System.out.print("факториал " + numeric + "! = ");
		while (numeric > 0){
			//factorial *= numeric--;
			factorial = factorial * numeric;
			numeric = numeric -1;
		}
		System.out.println(factorial);
	}
}
