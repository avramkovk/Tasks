package jc01_2020.avramkov.lesson05;

/*
 *
 * Вводится строка. Удалить из нее все пробелы. После этого определить, является ли она палиндромом (перевертышем),
 * т.е. одинаково пишется как с начала, так и с конца. Регистр букв не учитывать
 *
 *
 * Формат вывода:
 * "Да"
 * "Нет"
 *
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

        String noReverse = str.trim().toLowerCase().replace(" ","");
        String reverse = new StringBuilder(noReverse).reverse().toString();

        if (noReverse.equals(reverse)){
            System.out.println("Да");
        } else System.out.println("Нет");


		/*вариант №2
		String[] strArray = str.trim().toLowerCase().split(" ");
        StringBuilder strBuilder = new StringBuilder(strArray.length);
        for (String s : strArray) {
            strBuilder.append(s);
        }
        String noReverse = strBuilder.toString();
        String reverse = new StringBuilder(strBuilder).reverse().toString();
        if (noReverse.equals(reverse)){
            System.out.println("Да");
        } else System.out.println("Нет");*/
    }
}
