
package jc01_2020.avramkov.lesson08.task02;

/*
 *
 * На вход подается массив объектов Object. Реализовать статический параметризованный метод filter(), который принимает
 * в качестве параметров исходный массив и реализацию анонимного класса Filter и возвращает массив, состоящий только из
 * элементов, являющихся наследниками класса Number (для проверки используется ключевое слово instanceOf)
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    static class Cat {
    }
    interface Filter {
        boolean apply(Object o);
    }
    static <T> T[] filter(Object[] array, Filter filter) {
        List<T> result = new ArrayList<>();
        for (Object o : array) {
            if (filter.apply(o)) {
                result.add((T) o);
            }
        }
        return (T[]) result.toArray();
    }
    public static void main(String[] args) {
        Object[] array = {"String", 1, 2.0, new Cat(), 85L, new Cat()};
        Filter filter = new Filter(){
            @Override
            public boolean apply(Object o) {
                return o instanceof Number;

            }
        };

        Object[] arr = filter(array,filter);
        System.out.println(Arrays.toString(arr));

    }
}

