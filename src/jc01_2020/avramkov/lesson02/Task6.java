package jc01_2020.avramkov.lesson02;

/*
*
* Вводится целое число, обозначающее код символа по таблице ASCII. Определить, это код английской
* буквы (большой или маленькой) или какой-либо иной символ.
*
* Формат вывода (ошибки недопустимы):
* "Да"
* "Нет"
*
* Принимается любой вариант решения, но с точки зрения чтения и поддержки кода предпочтителен вариант решения через
* сравнение символов (см. приведение типов)
*/

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();

        char symbol = (char) code;

        if ((symbol >= 'a'&& symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')){
            System.out.print("Да"); //это буква
        } else System.out.print("Нет"); // это друго символ

        //второй вариант: через метод isLetter() - проверяет, является ли символ буквой (не только латинской)
/*        if (Character.isLetter(symbol)) {
            System.out.print("Да");
            System.out.println("1. Вы ввели код " + code + ". Согласно таблице ASCII это символ буквы: " + symbol);
        }  else {
            System.out.print("Нет");
            System.out.println("1. Введенный код не является символом буквы.");
        }*/


        /*//третий вариант: через коды
        if ((65 <= code && code <= 90) || (97 <= code && code <= 122)) {
            System.out.println("2. Вы ввели код " + code + ". Согласно таблице ASCII это символ буквы: " + symbol);
        } else {
            System.out.println("2. Введенный код не является символом буквы.");
        }*/
    }
}
