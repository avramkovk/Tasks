package jc01_2020.avramkov.test01;

/*
 *
 * Считать из консоли строку, состоящую из цифр.
 * Вычислить firstSum как сумму каждого четвертого элемента. В сумму включать только те цифры, которые больше 5
 * Вычислить secondSum как сумму каждого второго элемента. В сумму включать только те цифры, которые меньше 5
 * Вывести в консоль большее из значений firstSum и secondSum или слово "равны", если они совпадают
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Comparision {
    public static void main(String[] args) {

        int firstSum = 0;
        int secondSum = 0;

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split("");

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (String s : arr) {
            arrayList.add(Integer.parseInt(s));
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if ((i + 1) % 4 == 0) {
                if (arrayList.get(i) > 5) {
                    firstSum = firstSum + arrayList.get(i);
                }
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if ((i + 1) % 2 == 0) {
                if (arrayList.get(i) < 5) {
                    secondSum = secondSum + arrayList.get(i);
                }
            }
        }

        System.out.println("firstSum: " + firstSum);
        System.out.println("secondSum: " + secondSum);
        compare(firstSum, secondSum);

    }

    static void compare(int sum1, int sum2) {
        if (sum1 > sum2) {
            System.out.println(sum1 + " больше");
        } else if (sum1 < sum2) {
            System.out.println(sum1 + " меньше");
        } else System.out.println("равны");
    }
}

