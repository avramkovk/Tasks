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
            array[i] = scanner.nextInt(); //ввод чисел с клавиатуры
        }

        int minArray = array[0]; //- хранит значение минимального элемента массива. Присвоим ей нач. значение первого элемента массива
        int indexMin = 0; // объявляем переменную, храняющую значение индекса минимального элемента массива
        int maxArray = array[0];
        int indexMax = 0;

        for (int j = 0; j < array.length; j++) { //в цикле проходимся по каждому элементу массива
            if (minArray > array[j]) { //сравниваем каждый элемент массива со значением переменной, хранящей миним. значения массива
                minArray = array[j]; //если условие истинно, то переписываем значение переменной minArray
                indexMin = j; //находим индекс минимального значения массива
            }
            if (maxArray < array[j]) {
                maxArray = array[j];
                indexMax = j;
            }
        }

        if (indexMax < indexMin) {
            int i = indexMin;
            indexMin = indexMax;
            indexMax = i;
        }
        int sum = 0; //объявляем счетчик суммы элементов, которыя стоят между max и min
        for (int h = indexMin + 1; h < indexMax; h++) {
            sum = sum + array[h];
        }


        System.out.println("min " + minArray);
        System.out.println("max " + maxArray);
        System.out.println(sum);
    }
}
