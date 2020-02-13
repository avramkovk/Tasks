package jc01_2020.avramkov.lesson08.task01;

/*
 *
 * Написать программу, которая получает на вход латинскую букву в любом регистре и выводит в консоль номер этой буквы
 * в алфавите. Использовать enum
 *
 */

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();

        Alphabet.letters numberLetter = Alphabet.letters.valueOf(letter);
        System.out.println(numberLetter.getNumber());

    }
}
