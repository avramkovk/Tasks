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

		int sum0 = 0; //сумма чисел в 1 столбце. Начальное значение 0.
		int sum1 = 0; //сумма чисел во 2 столбце. Начальное значение 0.
		int sum2 = 0; //сумма чисел в 3 столбце. Начальное значение 0.
		int sum3 = 0; //сумма чисел в 4 столбце. Начальное значение 0.

		for (int i = 0; i < array[i].length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j == 0) { // 0 - индекс 1 столбца
					sum0 = sum0 + array[j][i];
				} else if (j == 1) { // 1 - индекс 2 столбца
					sum1 = sum1 + array[j][i];
				} else if (j == 2) { // 2 - индекс 3 столбца
					sum2 = sum2 + array[j][i];
				} else { // 3 - индекс 4 столбца
					sum3 = sum3 + array[j][i];
				}
			}
		}
		System.out.print(sum0 + ", "+ sum1 + ", "+ sum2 +", "+ sum3);
		System.out.println();

		int[] sumArray = new int[]{sum0,sum1,sum2,sum3}; //массив из сумм столбцов

		int sumMax = 0; //макс значение из массива сумм столбцов. Начальное значение 0.
		int indexMaxColumn = 0; //индекс столбца с максимальной суммой. . Начальное значение 0.
		for (int i = 0; i <4 ; i++) {
		if(sumMax < sumArray[i]){
			sumMax = sumArray[i];
			indexMaxColumn = i;
		}
		}System.out.println(indexMaxColumn);
    }
}
