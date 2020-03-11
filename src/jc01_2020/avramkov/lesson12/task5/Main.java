package jc01_2020.avramkov.lesson12.task5;

/*
 *
 * Создать класс Cat со строковым полем имени и числовым полем для количества оставшихся жизней. Создать функциональный
 * интерфейс, который сравнит двух котов и вернет имя кота с большим количеством жизней.
 *
 */

public class Main {
    public static void main(String[] args) {
        Cat first = new Cat("Рыжик", 11);
        Cat second = new Cat("Пушок", 5);
        System.out.println(Cat.lifeCompare.compareCats(first, second));

    }
}



