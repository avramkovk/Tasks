package jc01_2020.avramkov.lesson13;

/*
 *
 * Сгенерировать текущую дату с учетом временной зоны. Вывести в консоль эту дату в исходном виде и для 10 случайных
 * предустановленных временных зон. Каждую с новой строки с указанием временной зоны
 *
 */


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task2 {

        public static void main(String[] args) {
            ZonedDateTime zDate = ZonedDateTime.now();
            System.out.println(zDate);


        }
    }