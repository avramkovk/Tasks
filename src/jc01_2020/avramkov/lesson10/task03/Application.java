package jc01_2020.avramkov.lesson10.task03;

/*
 *
 * Считать из консоли строку (в строке латинские буквы в разном регистре и пробелы). Вывести в консоль 5 первых уникальных
 * букв, отсортированных по алфавиту. Буквы в разных регистрах считаются одинаковыми. Решить задачу за наименьшее
 * количество действий
 *
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strOld = scanner.nextLine();
//1
        String[] arrayOld = strOld.toLowerCase().trim().split(" ");
//2
        StringBuilder sb = new StringBuilder(arrayOld.length);
        for (String str : arrayOld) {
            sb.append(str);
        }
//3
        String strNew = sb.toString();
//4
        String[] arrayNew = strNew.split("");
//5
        HashSet<String> mySet = new HashSet<>();
		mySet.addAll(Arrays.asList(arrayNew));
//6
        Iterator<String> iterator = mySet.iterator();
        for (int i = 0; i < 5; i++) {
            if (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
