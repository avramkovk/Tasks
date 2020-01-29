package jc01_2020.avramkov.lesson03;

/*
 *
 * Угадать случайное число
 * В программе генерируется случайное целое число от 0 до 100. Пользователь должен его отгадать не более чем за 10 попыток.
 * После каждой неудачной попытки должно сообщаться больше или меньше введенное пользователем число, чем то, что загадано.
 * Если за 10 попыток число не отгадано, то вывести загаданное число.
 *
 * Теста на это задание нет, поиграйтесь сами против компьютера
 *
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secret = (int) (Math.random() * 100 + 1);
        int i = 1;

        for (; i <= 10; i++) {
            System.out.println("Попытка " + i);
            int number = scanner.nextInt();
            //System.out.println(secret);

            if (number == secret) {
                System.out.println("Вы угадали число " + secret + " с попытки #" + i);
                break;
            } else if (number > secret) {
                System.out.println("Введенное число больше загаданного.");

            } else {
                System.out.println("Введенное число меньше загаданного.");

            }


        }
        if(i>10){
			System.out.println("Вы не угадали. Было загадано число " + secret);
		}
    }
}


