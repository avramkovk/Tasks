package jc01_2020.avramkov.lesson08.task02.version2;

/*
 *
 * На вход подается массив объектов Object. Реализовать статический параметризованный метод filter(), который принимает
 * в качестве параметров исходный массив и реализацию анонимного класса Filter и возвращает массив, состоящий только из
 * элементов, являющихся наследниками класса Number (для проверки используется ключевое слово instanceOf)
 *
 */

class Application{

    static class Cat {
    }

    public static void main(String[] args) {
        Object[] array = {"String", 1, 2.0, new Cat(), 85L, new Cat(), -2};
        MethodFilter newFilter = new MethodFilter(); //создаем новый объект класса MethodFilter
        newFilter.apply(array);                     //вызываем метод объекта и передаем ему входные значения в виде массива array
    }
}
