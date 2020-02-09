package jc01_2020.avramkov.lesson05;

/*
 *
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
 * "abc cde def", то должно быть выведено "abcdef".
 *
 * Формат вывода:
 * строка
 *
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        str = str.replace(" ", ""); //удаляет пробелы

        //так как далее строка будет активно подвергаться изменениям, то чтобы сэкономить память преобразуем ее в StringBuilder
        StringBuilder newString = new StringBuilder(str);

        //два вложенных цикла. Первый проходится по каждому элементу строки, а второй проверяет на каждом элементе условие
        for (int i = 0; i < newString.length(); i++) {
            for (int j = 1; j < newString.length(); j++) {
                if (newString.charAt(i) == newString.charAt(j) && i != j)
                    newString.deleteCharAt(j);
            }
        }
        System.out.println(newString);
    }
}


