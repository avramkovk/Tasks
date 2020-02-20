package jc01_2020.avramkov.lesson09.task03;

/*
 *
 * Заполнить список строками. 5 раз перенести последний элемент списка в начало. Вывести в консоль значения списка в
 * виде массива (["str1","str2","str3"...])
 *
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> newList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            newList.add(str);//добавляем новый элемент в массив
            newList.addFirst(newList.getLast());//меняем местами первый элемент с последним
            newList.removeLast();//удаляем последний элемент
        }
        System.out.println(newList);
    }
}
