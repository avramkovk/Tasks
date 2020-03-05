package jc01_2020.avramkov.lesson12;

/*
 *
 * Создать класс Car с полем enum Color (определите в нем хотя бы 5 цветов) и строковым полем, которое будет хранить
 * текстовое представление цвета. Конструктор принимает и инициализирует только поле-перечисление. Создаем 50 автомобилей
 * случайного цвета. В стриме:
 * 1) заполняем второе поле текущим значением цвета
 * 2) оставляем в стриме первые 10 автомобилей
 * 3) оставляем в стриме все автомобили, значение цвета которых равно цвету последнего элемента перечисления (не задавать
 * цвет в явном виде! я могу менять значения и количество элементов перечисления)
 * 4) вывести в консоль буленовское значение есть ли такой автомобиль
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        Map<Car, String> auto = new HashMap<>();
        Random r = new Random();

		for (int i = 0; i < 5; i++) {
            auto.put(new Car(r.toString()), "empty");
        }
/*        Map<Car, String> collect = auto.values()
                .stream()
                .peek(v -> v.replace("empty", Car.Color.values()[r.nextInt(3)].toString())
                        .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
        System.out.println(collect);*/
    }
}
class Car {
    enum Color {BLACK, WHITE, GREEN}
    String color;
    public Car(String color) {
        this.color = color;
    }
}