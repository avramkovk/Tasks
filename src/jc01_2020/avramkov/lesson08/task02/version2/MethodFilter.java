package jc01_2020.avramkov.lesson08.task02.version2;

class MethodFilter implements Filter {

    @Override                                            //переопределяем метод из интерфейса Filter
    public void apply(Object[] o) {
//шаг 1. Преобразование массива объектов в массив чисел
        Number[] firstNumbers = new Number[o.length];        //создаем новый массив, размер которого равен массиву array
        int countFirst = 0;                          //счетчик элементов нового массива
        int countDigit = 0;                          //счетчик для тех элементов, которые являются числом
        for (Object value : o) {                   //проходимся по начальному массиву
            if (value instanceof Number) {        //если элемент массива является числом
                firstNumbers[countFirst++] = (Number) value;    //то записываем в его значение число из первого массива.
                                                        // Делаем преобразование типов из Object в Number
                countDigit++;                           //если элемент является числом, то увеличиваем счетчик на 1
            }                                         //в итоге получаем новый массив типа {1,2.0,85,-2,null,null}
        }

//шаг 2. Создадим новый массив, в котором будут только числа из массива firstNumbers
        Number[] secondNumbers = new Number[countDigit];         //создаем новый массив, размер которого равен массиву firstNumbers
        int countSecond = 0;                            //счетчик элементов нового массива
        for (Number number : firstNumbers) {
            if (number != null) {                   //если значение не равно null, т.е является числом
                secondNumbers[countSecond++] = number;    //то записываем в его значение число из первого массива.
            }
        }

//шаг 3. Выводим массив на экран
        for (Number num : secondNumbers) {
            System.out.println(num);
        }
    }
}
