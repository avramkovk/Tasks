package jc01_2020.avramkov.lesson13;

/*
 *
 * Сгенерировать текущую дату с учетом временной зоны. Вывести в консоль эту дату в исходном виде и для 10 случайных
 * предустановленных временных зон. Каждую с новой строки с указанием временной зоны
 *
 */


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;

public class Task2 {

        public static void main(String[] args) {
            ZonedDateTime zdtAtlantic = ZonedDateTime.now(ZoneId.of("Atlantic/Azores"));
            System.out.println(zdtAtlantic);

            List<String> list = new ArrayList<>(ZoneId.getAvailableZoneIds()); //список всех зон

            Random r = new Random();
            int[] rand = new int[10]; //массив с 10 рандомными индексами из list
            for (int i = 0; i < rand.length; i++) {
                rand[i]=r.nextInt(list.size());
            }

            for (int i = 0; i < 10; i++) {
                System.out.println(i+1 +". " + ZonedDateTime.of(LocalDateTime.now(),ZoneId.of(list.get(rand[i]))));
            }
        }
    }