package jc01_2020.avramkov.lesson12;

/*
 *
 * Дан стрим целых чисел. Вывести в консоль 10 первых нечетных значений. Каждое с новой строки
 *
 * Формат вывода:
 * число
 * число
 * ...
 *
 */

import java.util.Random;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        int start = new Random().nextInt(50); //генерирует числа до 50
        System.out.println("start = " + start);

        IntStream.range(start, start + 40).filter(x -> x % 2 != 0).limit(10).forEach(System.out::println); // place code here
    }

}
