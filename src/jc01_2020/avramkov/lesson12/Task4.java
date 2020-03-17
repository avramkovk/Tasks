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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) {
        Random random = new Random();
        List<Car> garage = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            garage.add(new Car(Color.values()[random.nextInt(5)]));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(garage.get(i).getColor());
        }
        System.out.println("---");
        boolean trueCar = garage.stream()
                .peek(car -> car.setColored(car.getColor().getColor()))
                .limit(10)
                .filter(car -> car.getColor() == Color.values()[Color.values().length - 1])
                .peek(car -> System.out.println("Последнее значение цвета в Enum: " + car.getColor()))
                .map(Car::getColored)
                .anyMatch(x -> true);
        System.out.println("Автомобиль с таким цветом существует? - " + trueCar);
    }


}

enum Color {
    RED("Red"),
    WHITE("White"),
    BLUE("Blue"),
    GREEN("Green"),
    GREY("Grey");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Car {

    private String colored;
    private Color color;

    public Car(Color color) {
        this.color = color;
    }

    public String getColored() {
        return colored;
    }

    public void setColored(String colored) {
        this.colored = colored;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }



}