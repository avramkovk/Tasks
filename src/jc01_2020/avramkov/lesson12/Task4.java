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

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        Map<Car, String> autoWithEmptyValue = new HashMap<>();
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            autoWithEmptyValue.put(new Car(Car.Color.values()[r.nextInt(5)].toString()), "empty");
        }
        System.out.println(autoWithEmptyValue);
try{
//заполнение Карты с автобилями. Значение ключа берется старое, а в значение записывается рандомный цвет
        Map<Car, String> autoFullMap = autoWithEmptyValue.entrySet()
                .stream()
                .collect(Collectors.toMap(k -> k.getKey(), v -> Car.Color.values()[r.nextInt(5)].toString()));
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
    }catch (NullPointerException e){
    System.out.println("словили NullPointerException");}
    }
}

class Car {
    enum Color {BLACK, WHITE, GREEN, PINK, YELLOW}

    String color;

    public Car(String color) {
        this.color = color;
    }
}