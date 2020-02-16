package jc01_2020.avramkov.lesson08.task02.version3;

/*
 *
 * На вход подается массив объектов Object. Реализовать статический параметризованный метод filter(), который принимает
 * в качестве параметров исходный массив и реализацию анонимного класса Filter и возвращает массив, состоящий только из
 * элементов, являющихся наследниками класса Number (для проверки используется ключевое слово instanceOf)
 *
 */
//вариант 3. через анонимный класс
public class Application {


    static class Cat {
    }

    interface Filter {
        void apply(Object[] o);
    }


    public static void main(String[] args) {
        Object[] array = {"String", 1, 2.0, new Cat(), 85L, new Cat(), -2};

//создаем анонимный класс
        Filter newFilter = new Filter() {
            @Override
            public void apply(Object[] o) {
//шаг 1. Преобразование массива объектов в массив чисел
                Number[] first = new Number[o.length];        //создаем новый массив, размер которого равен массиву array
                int indexFirst = 0;                          //счетчик элементов нового массива
                int onlyDigit = 0;                          //счетчик для тех элементов, которые являются числом
                for (Object value : o) {                   //проходимся по начальному массиву
                    if (value instanceof Number) {        //если элемент массива является числом
                        first[indexFirst++] = (Number) value;    //то записываем в его значение число из первого массива.
                                                                // Делаем преобразование типов из Object в Number
                        onlyDigit++;                           //если элемент является числом, то увеличиваем счетчик на 1
                    }                                         //в итоге получаем новый массив типа {1,2.0,85,-2,null,null}
                }

//шаг 2. Создадим новый массив, в котором будут только числа из массива first
                Number[] second = new Number[onlyDigit];         //создаем новый массив, размер которого равен массиву first
                int indexSecond = 0;                            //счетчик элементов нового массива
                for (Number value : first) {
                    if (value != null) {                   //если значение не равно null, т.е является числом
                        second[indexSecond++] = value;    //то записываем в его значение число из первого массива.
                    }
                }

//шаг 3. Выводим массив на экран
                for (Number number : second) {
                    System.out.println(number);
                }
            }
        };

        newFilter.apply(array);                     //вызываем метод объекта и передаем ему входные значения в виде массива array
    }
}