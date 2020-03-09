package jc01_2020.avramkov.lesson12;

/*
 *
 * Создать класс Cat со строковым полем имени и числовым полем для количества оставшихся жизней. Создать функциональный
 * интерфейс, который сравнит двух котов и вернет имя кота с большим количеством жизней.
 *
 */

public class Task5 {
    public static void main(String[] args) {
        Cat first = new Cat("Рыжик", 5);
        Cat second = new Cat("Пушок", 5);

        LifeCompare lifeCompare = (x, y) -> {

            if (x.getLifeCat() == y.getLifeCat()) {
                return "Коты имеют одинаковое количество жизней";

            } else if (x.getLifeCat() > y.getLifeCat()) {
                return x.getNameCat();
            }

            return y.getNameCat();
        };
        System.out.println(lifeCompare.compareCats(first, second));

    }
}

class Cat {
    String nameCat;
    int lifeCat;

    public String getNameCat() { return nameCat; }
    public int getLifeCat() { return lifeCat; }

    public Cat(String nameCat, int lifeCat) {
        this.nameCat = nameCat;
        this.lifeCat = lifeCat;
    }
}

interface LifeCompare { String compareCats(Cat first, Cat second);}