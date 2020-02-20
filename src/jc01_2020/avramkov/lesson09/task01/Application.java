package jc01_2020.avramkov.lesson09.task01;

/*
 *
 * Заполнить список строками. Вывести в консоль самую длинную строку
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> newList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
                newList.add(str);
        }

        String max = newList.get(0);

        for (String value : newList) {
            if (max.length() < value.length()) {
                max = value;
            }
        }
        System.out.print(max);
    }
}
