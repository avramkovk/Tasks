package jc01_2020.avramkov.lesson13;

/*
 *
 * Сгенерировать случайную дату в интервале с 1 по 4 марта 2020 (включительно). Вывести в консоль каждую дату и
 * результат сравнения этих дат (дата1 больше/меньше/равна дата2)
 *
 */

import java.time.LocalDate;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        Random r = new Random();
        LocalDate date1 = LocalDate.of(2020, 3, r.nextInt(4) + 1);
        LocalDate date2 = LocalDate.of(2020, 3, r.nextInt(4) + 1);
        compareDate(date1, date2);
    }

    public static void compareDate(LocalDate otherDate1, LocalDate otherDate2) {
        if (otherDate1.isAfter(otherDate2)) {
            System.out.println(otherDate1 + " больше " + otherDate2);
        } else if (otherDate1.isBefore(otherDate2)) {
            System.out.println(otherDate1 + " меньше " + otherDate2);
        } else System.out.println(otherDate1 + " равна " + otherDate2);
    }
}
