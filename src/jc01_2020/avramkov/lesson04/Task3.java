package jc01_2020.avramkov.lesson04;

/*
 *
 * Найти индекс минимального по модулю элемента массива.
 *
 * Пример: {10, -3, -5, 2, 5}. Минимальным по модулю элементом является число 2. Его индекс 3 (т.к. индексация массивов
 * начинается с нуля)
 *
 * Формат вывода:
 * одно число
 *
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];


        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt(); //шаг 1. заполняем массив
        }

        int min = array[0]; //присвоение минимальному значению массива начального значенения равного первому элементу массива
		int indexForMin = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0) {
                array[j] = -1 * array[j]; //шаг 2. берем модуль для отриц чисел
            }
        }



        for (int k = 0; k < array.length; k++) {
            if (min > array[k]){
                min = array[k];
			indexForMin = k;}
        }

		System.out.println();
        System.out.println("Min:"+min);
		System.out.println(indexForMin);


    }
}