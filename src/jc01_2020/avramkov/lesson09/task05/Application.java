package jc01_2020.avramkov.lesson09.task05;

/*
 *
 * Заполнить два списка целыми числами. Из первого списка удалить все отрицательные числа. Из второго - все положительные.
 * Создать третий список, состоящий из оставшихся элементов первых двух. Из третьего списка удалить все элементы со
 * значением 0. Вывести итоговый список в консоль. Максимально использовать готовые методы коллекций
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Объявляем список 1 список
        List<Integer> array1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int str1 = scanner.nextInt();
            array1.add(str1);	// Заполнить список
        }

        // Объявляем список 2 список
        List<Integer> array2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int str2 = scanner.nextInt();
            array2.add(str2);	// Заполнить список
        }

        //removeIf модифицирует существующий список, а не создает новый
        array1.removeIf(num -> (num < 0)); //удаляем отрицательные значения
        array2.removeIf(num -> (num > 0)); //удаляем положительные значения

        array1.addAll(array2); //добавляем в список1 значения из списка2

        array1.removeIf(num -> (num == 0)); //удаляем нулевые значения
        System.out.println(array1);

    }
}