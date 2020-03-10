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

import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    private static Random r = new Random();

    private static String randomColor(){
        return Car.Color.values()[r.nextInt(5)].toString();
    }

    public static void main(String[] args) {
        Map<Car, String> autoWithEmptyValue = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            autoWithEmptyValue.put(new Car(randomColor()), "empty");
        }

//заполнение Карты с автобилями. Значение ключа берется старое, а в значение записывается рандомный цвет
        Map<Car, String> autoFullMap = autoWithEmptyValue.entrySet()
                .stream()
                .collect(Collectors.toMap(k -> k.getKey(), v -> randomColor()));
        System.out.println(autoFullMap);

        String lastCarColor = Objects.requireNonNull(autoFullMap
                .entrySet()
                .stream()
                .reduce((first, second) -> second) //находим последний элемент Карты autoFullMap
                .orElse(null))//если нет последнего элемента, то вернуть null
                .getValue(); //получаем значение последнего элемента Карты, то есть цвет авто
        System.out.println(lastCarColor);

        boolean lastColor = autoFullMap
                .entrySet()
                .stream()
                .limit(3) //оставлям первые 3 авто
                .filter(x -> x.getValue().equals(lastCarColor)) //выбираем авто, у которых совпадает цвет с последним авто
                .anyMatch(x -> true);//если есть хоть 1 авто, то выводим true
        System.out.println(lastColor);
    }
}

class Car {
    enum Color {BLACK, WHITE, GREEN, PINK, YELLOW}

    String color;

    public Car(String color) {
        this.color = color;
    }
}