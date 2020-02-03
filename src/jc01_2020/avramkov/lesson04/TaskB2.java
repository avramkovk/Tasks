package jc01_2020.avramkov.lesson04;

/*
 *
 * Вывести на экран индексы всех минимальных элементов матрицы.
 * Номер столбца будет определяться первым индексом.
 * Т.е. в исходной матрице int[4][3] 4 столбца по 3 строки
 *
 * Формат вывода (ошибки недопустимы):
 * строка: 1, столбец: 2
 * строка: 2, столбец: 0
 *
 */

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[4][3];

//ввод массива с клавиатуры
        System.out.println("Введите данные массива: ");
        for (int i = 0; i < array[0].length; i++) { //array[0] - длина вложенного массива
            for (int j = 0; j < array.length; j++) {
                array[j][i] = scanner.nextInt();
            }
        }

//вывод элементов массива на экран
        System.out.println("Вывод массива: ");
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i]);
            }
            System.out.println();
        }

//поиск минимального элемента массива
        int minValue = array[0][0]; //минимальное значение массива, начальное значение равно элементу array[0][0]
        for (int i = 0; i < array[0].length; i++) { //длина вложенного массива
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] < minValue) {
                    minValue = array[j][i];
                }
            }
        }

//вывод на экран идексов минимального значения массива
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] == minValue) {
                    System.out.println("строка: " + i + ", столбец: " + j);
                }
            }
        }
    }
}
