package jc01_2020.avramkov.lesson08.task02.version2;

class MethodFilter implements Filter {

    @Override                                            //переопределяем метод из интерфейса Filter
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
        for (Number number : first) {
            if (number != null) {                   //если значение не равно null, т.е является числом
                second[indexSecond++] = number;    //то записываем в его значение число из первого массива.
            }
        }

//шаг 3. Выводим массив на экран
        for (Number num : second) {
            System.out.println(num);
        }
    }
}
