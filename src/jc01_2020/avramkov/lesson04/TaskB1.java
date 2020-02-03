package jc01_2020.avramkov.lesson04;

/*
 *
 * Сжать массив, удалив из него все элементы, величина которых находится в интервале [а, b] (квадратные скобки означают,
 * что крайние значения так же включаются в интервал).
 * Освободившиеся в конце массива элементы заполнить нулями.
 *
 * Пример: {4, 10, 18, 5, 11, 22, 13}. Интервал [10, 18].
 * Ответ:
 * 4
 * 5
 * 22
 * 0
 * 0
 * 0
 * 0
 *
 * Формат вывода:
 * значение каждой ячейки массива с новой строки
 *
 */

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[7];
        //System.out.println("Введите элементов массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Введите левую границу интервала: ");
        int a = scanner.nextInt();
        System.out.println("Введите правую границу интервала: ");
        int b = scanner.nextInt();

/*        System.out.println("Первоначальный массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
*/

       //System.out.println("Массив с замененными элементами");
        for (int i = 0; i < array.length; i++) {
            if (a <= array[i] && array[i] <= b) {
                array[i] = 0; //если число попадает в диапазон, то заменяем его нулями
            }
            //System.out.print(array[i]);
        }
       // System.out.println();



        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == 0) { //если j-ый элемент равен нулю
                    int temp = array[j]; //создаем временную переменную и помещаем туда его значение
                    array[j] = array[j + 1];//перестановка нуля вправо на 1 индекс
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Массив со сдвигом");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}



