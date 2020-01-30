package jc01_2020.avramkov.lesson04;

/*
 *
 * Найти в массиве те элементы, значение которых больше среднего арифметического, взятого от всех элементов массива.
 *
 * Пример: {1, 2, 8, 4, 16, 10, 6}. Среднее: 6,71.
 * Вывод:
 * 8
 * 16
 * 10
 *
 * Формат вывода:
 * каждое число с новой строки. Сохранить порядок следования чисел в массиве
 *
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[7];
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum = sum + array[i];
        }
        double average = sum / array.length;
        //System.out.println(average);

        for (int j = 0; j < array.length; j++) {
            if (array[j] > average) {
                System.out.println(array[j]);
            }
        }
    }
}
