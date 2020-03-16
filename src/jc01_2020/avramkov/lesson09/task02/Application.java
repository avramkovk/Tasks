package jc01_2020.avramkov.lesson09.task02;

/*
 *
 * Заполнить список строками. Каждую новую строку вставлять в начало списка. Вывести в консоль строку, с которой
 * начинается список
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            linkedList.add(0, str);
        }
        System.out.println(linkedList.get(0));
    }

}
