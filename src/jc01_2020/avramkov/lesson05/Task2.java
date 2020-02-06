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

        System.out.println(str);
		String[] strArray = str.trim().split(" "); //trim() - удаляет пробелы в начале и конце строки
        //for (int i = 0; i < strArray.length; i++) {       //split(" ") - возвращает массив из элементов, которые были разделены пробелом
        //   System.out.print(strArray[i]);
        //}
        String joinArray = String.join("", strArray);
        String reverse = new StringBuilder(joinArray).reverse().toString();

        if (joinArray.equalsIgnoreCase(reverse)){
            System.out.println("Да");
        } else System.out.println("Нет");


    }
}
