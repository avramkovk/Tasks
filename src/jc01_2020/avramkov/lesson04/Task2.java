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
        int[] array = new int[7]; //создаем массив
        double sum = 0; // счетчик суммы, изначально равен нулю

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt(); //ввод с клавиатуры
            sum = sum + array[i]; //при первом проходе цикла первый элемент массива суммируем со счетчиком суммы, т.е 0+array[0]
                                    //и записываем это значение в sum/
        }
        double average = sum / array.length; // вычисляем среднее значение элементов массива
        //System.out.println(average);

        for (int j = 0; j < array.length; j++) {
            if (array[j] > average) { //если элемент массива больше среднего
                System.out.println(array[j]); //то выводим его на экран
            }
        }
    }
}
