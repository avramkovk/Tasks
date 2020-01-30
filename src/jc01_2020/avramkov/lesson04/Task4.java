package jc01_2020.avramkov.lesson04;

/*
 *
 * В одномерном массиве найти сумму элементов, находящихся между минимальным и максимальным элементами (их порядок не важен).
 * Сами минимальный и максимальный элементы в сумму не включать.
 *
 * Пример: {10, 30, 20, 15, 8, 21, 14}. max = 30, min 8. В сумму должны пойти значения 20 и 15. Ответ: 35
 *
 * Формат вывода:
 * одно число
 */

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[7];




        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }

        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (min > array[j]){
                min = array[j];
            }
        }

        int max = array[0];
        for (int k = 0; k < array.length; k++) {
            if (max < array[k]){
                max = array[k];
            }
        }

        int sum = 0;
        for (int h = 0; h < array.length; h++) {
            if(array[h] > min && array[h] < max){
                sum = sum + array[h];
            }
        }


        System.out.println("min "+min);
        System.out.println("max "+max);
        System.out.println(sum);
	}
}
