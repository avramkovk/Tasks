package jc01_2020.avramkov.lesson02;

/*
*
* Среди трех чисел найти среднее по величине
* Вывести на экран среднее значение. В комбинации чисел "-8, 10, 10" среднее по величине число - 10.
* Учитывайте возможность ввода отрицательных чисел
*
* Формат вывода (ошибки недопустимы):
* одно число
*
*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a <= b && b <=c) || (a >= b && b >= c)){
            System.out.println(b);
        } else if ((b <= a && a <=c) || (b >= a && a >= c)) {
            System.out.println(a);
        } else {System.out.println(c);
        }

    }
}
