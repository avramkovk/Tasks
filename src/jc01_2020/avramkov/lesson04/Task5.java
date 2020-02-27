package jc01_2020.avramkov.lesson04;

/*
 *
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму и вывести в консоль его индекс.
 * Номер столбца будет определяться первым индексом.
 * Т.е. в исходной матрице int[4][3] 4 столбца по 3 строки
 *
 * Формат вывода:
 * одно число
 *
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[4][3];
        for (int i = 0; i < array[i].length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[j][i] = scanner.nextInt();
            }
        }

        int[] sum = new int[4];					//массив из элементов столбца
        int[] sumArray = new int[4];			//массив из сумм стобцов
        for (int j = 0; j < array.length; j++) {
            sum[j] = 0;
            for (int i = 0; i < array[i].length; i++) {
                sum[j] = sum[j] + array[j][i];
            }
            System.out.println("sum" + j + ": " + sum[j]);
        }

        int[] sumArrayAll = new int[4];	//заполняем массив, где каждый элемент - это сумма определенного столбца
        for (int i = 0; i < sumArrayAll.length; i++) {
            sumArrayAll[i] = sum[i];
        }


		int sumMax = 0; //макс значение из массива сумм столбцов. Начальное значение 0.
		int indexMaxColumn = 0; //индекс столбца с максимальной суммой. . Начальное значение 0.
		for (int i = 0; i <4 ; i++) {
		if(sumMax < sumArrayAll[i]){
			sumMax = sumArrayAll[i];
			indexMaxColumn = i;
		}
		}System.out.println(indexMaxColumn);
    }
    }

