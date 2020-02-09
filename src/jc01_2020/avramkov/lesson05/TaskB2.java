package jc01_2020.avramkov.lesson05;

/*
 *
 * Проверить, что введенная фамилия является двойной, т.е. пишется через дефис. Фамилия может быть написана как
 * кириллицей, так и латиницей, но НЕ одновременно с помощью двух алфавитов. Остальные требования к фамилиям адекватные
 * (только буквы)
 *
 * Вывести в консоль логический результат проверки (boolean)
 *
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean result = false;

        String regexp = "^[A-Z]{1}[a-z]+[\\-]?[A-Z]{1}[a-z]+$|^[А-Я]{1}[а-я]+[\\-]?[А-Я]{1}[а-я]+$";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            result = true;
        } else result = false;
		System.out.println(result);
    }
}
