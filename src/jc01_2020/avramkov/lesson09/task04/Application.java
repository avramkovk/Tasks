package jc01_2020.avramkov.lesson09.task04;

/*
 *
 * Заполнить список натуральными числами (целые положительные). Вывести в консоль среднее арифметическое всех четных
 * значений
 *
 * N.B. Ноль не является натуральным числом
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Объявить список
        ArrayList<Integer> newListInt = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer numeric = scanner.nextInt();
            // Заполнить список
            newListInt.add(numeric);
        }

        int sumAll = 0;
        int count = 0;
        for (Integer num : newListInt) {
            if (num % 2 == 0 && num != 0) {
                count++;
                sumAll = sumAll + num;
            }
        }

        int sum = sumAll / count;
        System.out.println(sum);

    }
}
