package jc01_2020.avramkov.lesson05;

/*
 *
 * Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы. Требуется все числа, которые
 * встречаются в строке, поместить в отдельный целочисленный массив. Например, если дана строка
 * "data 48 call 9 read13 blank0a", то в массиве должны оказаться числа 48, 9, 13 и 0. Каждый эдемент массива вывести
 * в консоль с новой строки
 *
 * Формат вывода:
 * число
 * число
 * число
 * ...
 *
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] strDigit = str.split("\\D"); //split("\\D") - возвращает массив из элементов, которые были разделены
        // нецифровыми символами, то есть возвращает массив только из цифр

        for (int i = 0; i < strDigit.length; i++) {

            if (!strDigit[i].equals("")) {//если массив только не пустые элементы, т.е выведет наши цифры
                System.out.println(strDigit[i]);
            }
        }
    }
}
