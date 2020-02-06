package jc01_2020.avramkov.lesson05;

/*
 *
 * Определить, является ли введенное слово идентификатором, т.е. начинается ли оно с английской буквы в любом регистре
 * или знака подчеркивания и не содержит других символов, кроме букв английского алфавита (в любом регистре), цифр и
 * знака подчеркивания.
 *
 * Формат вывода:
 * "Да"
 * "Нет"
 *
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Pattern pText = Pattern.compile("^[\\w&&[^0-9]]+[\\w]+");
        Matcher mText = pText.matcher(str);
        if (Pattern.matches("^[\\w&&[^0-9]]+[\\w]+",str)) {
            System.out.println("Да");
        } else System.out.println("Нет");
//a
    }
}


