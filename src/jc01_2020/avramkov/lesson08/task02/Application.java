package jc01_2020.avramkov.lesson08.task02;

/*
 *
 * На вход подается массив объектов Object. Реализовать статический параметризованный метод filter(), который принимает
 * в качестве параметров исходный массив и реализацию анонимного класса Filter и возвращает массив, состоящий только из
 * элементов, являющихся наследниками класса Number (для проверки используется ключевое слово instanceOf)
 *
 */

//вариант 1. через дженерик и анонимный класс
public class Application {

    static class Cat {
    }

    interface Filter {
        void apply(Object[] o);
    }

//метод-дженерик
    public static <Number> Number filter(Number onlyNumber) {
        if (onlyNumber instanceof java.lang.Number) {
            System.out.println(onlyNumber);
        }
        return onlyNumber;
    }

    public static void main(String[] args) {
        Object[] array = {"String", 1, 2.0, new Cat(), 85L, new Cat(), -2};

//создаем анонимный класс
        Filter newFilter = new Filter() {
            @Override                           //переопределяем метод из интерфейса
            public void apply(Object[] o) {
                for (Object array : o) {        //проходимся по каждому элемент массива
                    filter(array);              //и передаем его значение в метод filter()
                }
            }
        };
        newFilter.apply(array);                 //вызываем метод объекта и передаем ему входные значения в виде массива array

    }
}