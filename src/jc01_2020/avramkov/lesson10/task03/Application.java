package jc01_2020.avramkov.lesson10.task03;

/*
 *
 * Считать из консоли строку (в строке латинские буквы в разном регистре и пробелы). Вывести в консоль 5 первых уникальных
 * букв, отсортированных по алфавиту. Буквы в разных регистрах считаются одинаковыми. Решить задачу за наименьшее
 * количество действий
 *
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String strOld = scanner.nextLine();

        String[] arrayOld = strOld.toLowerCase().split("");                       // #1
        LinkedHashSet<String> hashSet = new LinkedHashSet<>(Arrays.asList(arrayOld));   // #2
        int count = 0;                                                                  // #3
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext() && count < 5) {
            System.out.print(iterator.next());
            count++;
        }



/*//1. преобразование строки в массив: удаляем пробелы в начале и конце, приводим все к нижнему регистру. Новый массив будет
//состоять из элементов, ранее разделенных пробелами
        String[] arrayOld = strOld.toLowerCase().trim().split(" ");
//2. преобразование массива из п.1 в строку через StringBuilder
        StringBuilder sb = new StringBuilder(arrayOld.length);
        for (String str : arrayOld) {
            sb.append(str);
        }
//3. преобразование StringBuilder в строку
        String strNew = sb.toString();
//4. созданием массива из строки, где каждый символ строки будет являться отдельным элементом массива
        String[] arrayNew = strNew.split("");
//5. создание карты. В нее помещаются все значения из массива
        HashSet<String> mySet = new HashSet<>(Arrays.asList(arrayNew));
//6. вывод первых 5 элементов карты на экран через итератор
        Iterator<String> iterator = mySet.iterator();
        for (int i = 0; i < 5; i++) {
            if (iterator.hasNext()) {
                System.out.print(iterator.next());
            }
        }*/
    }
}
