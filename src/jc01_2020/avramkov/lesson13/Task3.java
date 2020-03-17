package jc01_2020.avramkov.lesson13;

/*
 *
 * Создать приложение-напоминалку о количестве дней до дней рождения. Использовать карту. Ключ - имя человека,
 * значение - дата рождения (в прошлом, LocalDate). Реализовать метод по добавлению записи в карту (входные параметры имя и дата
 * строкой в формате "дд/мм/гггг"). Реализовать метод, который выведет в консоль имена и оставшиеся дни до
 * ближайшего дня рождения всех ("имя - осталось дней", каждое с новой строки). Отдельно реализовать метод, который
 * вернет кол-во дней для одного конкретного человека (входной параметр - имя)
 *
 */

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task3 {
    private static Map<String, LocalDate> birthDayMap = new HashMap<>();
    private static Month month = LocalDate.now().getMonth();

    public static void main(String[] args) {

        //birthDayMap.put("Rob", LocalDate.of(2019, 1, 2));
        //birthDayMap.put("Harry", LocalDate.of(1990, 1, 22));
       // birthDayMap.put("Bob", LocalDate.of(1980, 2, 1));
        birthDayMap.put("Alister ", LocalDate.of(2014, 2, 21));
        birthDayMap.put("Anna", LocalDate.of(2010, 3, 3));
        birthDayMap.put("Crispin ", LocalDate.of(1961, 3, 23));
        birthDayMap.put("Elza", LocalDate.of(2001, 4, 4));
        birthDayMap.put("Piers ", LocalDate.of(1939, 4, 24));
        birthDayMap.put("Mary", LocalDate.of(2000, 12, 15));

        //добавление дня рождения в Карту
        addBirthDayToMap("Donald", LocalDate.of(1999, 12, 31));

        System.out.println("--------------------------------------------------------------------");

        //вывод ближайших дней рождений к определенной дате
        allBirthDay(birthDayMap, LocalDate.of(2020, 1, 1));

        System.out.println("--------------------------------------------------------------------");

        //вывод оставшихся дней до дня рождение определенного человека
        System.out.println("Сегодня " + LocalDate.now());
        birthDayName("Anna");
        birthDayName("Rob");
        birthDayName("Elza");
    }

    //добавление человека в Карту
    public static void addBirthDayToMap(String name, LocalDate localDate) {
        birthDayMap.put(name, localDate);
    }

    //вывод ближайших дней рождения относительно определенной даты
    public static void allBirthDay(Map<String, LocalDate> map, LocalDate otherDate) {
        System.out.println("Ближайшие дни рождения к дате " + otherDate);
        for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
            int daysDifference = entry.getValue().getDayOfYear() - otherDate.getDayOfYear();
            if (daysDifference > 0 && daysDifference < 30) {
                System.out.println(entry.getKey() + ", осталось " + daysDifference + " дн.");
            }
            /*else if ((daysDifference < 0 && daysDifference > -30)) {
                System.out.println("День рождения " + entry.getKey() + " был " + Math.abs(daysDifference) + " дн. назад");
            }*/
        }
    }

    //вывод оставшихся дней до дня рождения определенного человека относительно текущей даты
    public static void birthDayName(String name) {
        for (Map.Entry<String, LocalDate> entry : birthDayMap.entrySet()) {

            int daysDifference = entry.getValue().getDayOfYear() - LocalDate.now().getDayOfYear();
            String nameCurrent = entry.getKey();
            if (name.equals(nameCurrent) && daysDifference > 0) {
                System.out.println("До дня рождения " + name + " осталось " + daysDifference + " дн.");
            } else if (name.equals(nameCurrent) && daysDifference < 0) {
                System.out.println("День рождения " + name + " был " + Math.abs(daysDifference) + " дн. назад");
            }
        }
    }

}

//рабочий вариант 1
/*	public static void allBirthDay(Map<String, LocalDate> map) {
		System.out.println("Скоро день рождения отмечают: ");
		Iterator<Map.Entry<String, LocalDate>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, LocalDate> entry = iterator.next();
			int t = entry.getValue().getDayOfYear() - LocalDate.now().getDayOfYear();
			if (t > 0 && t < 30) {
				System.out.println(entry.getKey() + ", осталось " + t + " дн." );
			}
		}
	}*/

//рабочий вариант 2
/*public static void allBirthDay(Map<String, LocalDate> map) {
		System.out.println("В следующем месяце дни рождения отмечают: ");
		Iterator<Map.Entry<String, LocalDate>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, LocalDate> entry = iterator.next();
			if (LocalDate.now().plusMonths(1).getMonth() == (entry.getValue().getMonth())) {
				System.out.println(entry.getKey() + ", " + entry.getValue().getDayOfMonth() + " " + entry.getValue().getMonth());
			}
		}
	}*/
