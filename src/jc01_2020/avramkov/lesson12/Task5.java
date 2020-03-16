package jc01_2020.avramkov.lesson12;

/*
 *
 * Создать класс Cat со строковым полем имени и числовым полем для количества оставшихся жизней. Создать функциональный
 * интерфейс, который сравнит двух котов и вернет имя кота с большим количеством жизней.
 *
 */

public class Task5 {
    public static void main(String[] args) {
        Cat first = new Cat("Рыжик", 11);
        Cat second = new Cat("Пушок", 5);
        System.out.println(Cat.lifeCompare.compareCats(first, second));
    }
}


class Cat {
    private String nameCat;
    private int lifeCat;

    public String getNameCat() {
        return nameCat;
    }
    public int getLifeCat() {
        return lifeCat;
    }

    public Cat(String nameCat, int lifeCat) {
        this.nameCat = nameCat;
        this.lifeCat = lifeCat;
    }

    static LifeCompare lifeCompare = (first1, second1) -> {
        if (first1.getLifeCat() == second1.getLifeCat()) {
            return "Коты имеют одинаковое количество жизней";
        } else if (first1.getLifeCat() > second1.getLifeCat()) {
            return first1.getNameCat();
        }
        return first1.getNameCat();
    };
}


interface LifeCompare {
    String compareCats(Cat first, Cat second);
}