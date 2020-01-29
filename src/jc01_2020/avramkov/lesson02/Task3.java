package jc01_2020.avramkov.lesson02;

/*
 *
 * Вводятся два целых числа. Проверить делится ли первое на второе.
 * Вывести на экран сообщение об этом, а также остаток (если он есть) и частное (в любом случае)
 *
 * Формат вывода (ошибки недопустимы):
 * "Делится. Частное = Х"
 * "Не делится. Частное = Х. Остаток = Y"
 * "Недопустимая операция"
 *
 */

import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите первое число:");
        long first = scanner.nextLong();
        System.out.println("Введите второе число:");
        long second = scanner.nextLong();
        try {
            if (first % second == 0) {
                System.out.println("Делится. Частное = " + first / second);
            } else {
                System.out.println("Не делится. Частное = " + first / second + ". Остаток = " + first % second);
            }

        } catch (ArithmeticException e) {

            System.out.println("Недопустимая операция");
        }
    }
}