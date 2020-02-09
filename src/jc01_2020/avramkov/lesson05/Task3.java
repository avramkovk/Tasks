package jc01_2020.avramkov.lesson05;

/*
 *
 * Найти в строке указанную подстроку, заменить ее на новую и вывести в консоль результат. Строку, ее подстроку для
 * замены и новую подстроку вводит пользователь.
 *
 * Формат вывода:
 * строка
 *
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку");
        String str = scanner.nextLine();

        System.out.println("Введите подстроку для замены");
        String strReplaceOld = scanner.nextLine();

        System.out.println("Введите новую подстроку");
        String strReplaceNew = scanner.nextLine();

        System.out.println("Новая строка: " + str.replace(strReplaceOld,strReplaceNew));
    }
}
