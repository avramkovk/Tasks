package jc01_2020.avramkov.lesson08.task03;

/*
 * Создать объект своего класса Date (не java.util или java.sql), используя вложенные классы Год, Месяц, День.
 * Методы: задать дату, вывести на консоль день недели по заданной дате. День недели представить в виде перечисления (enum).
 * Рассчитать количество дней, в заданном временном промежутке.
 *
 * public Date(int day, int month, int year)
 * public DayOfWeek getDayOfWeek()
 * public int getDayOfYear()
 * public int daysBetween(Date startDate, Date endDate)
 *
 * В классе Year должна осуществляться проверка на високостность. Установить это значение для соотв. атрибута года.
 * В классе Month можно сделать метод который позволит узнать количество дней для того или иного месяца [1-12].
 * Метод можно использовать для подсчета дней в других методах.
 *
 * public int getDays(int monthNumber, boolean leapYear)
 *
 * Перечисление должно иметь конструктор с параметром, для того чтобы задать индексы дней недели [0-6]. 0 – Понедельник.
 *
 * Так же можно создать статический метод
 * public static DayOfWeek valueOf (int index)
 * Для того чтобы можно было после математических расчетов использовать данный метод для преобразования индекса дня недели
 * в соотв. элемент перечисления.
 *
 * При желании можно сделать собственную архитектуру для решения поставленной задачи. Главное продемонстрировать в решении
 * использование вложенных классов и перечисления.
 *
 */


public class Application {


    public static class Date {
        enum DayOfWeek {

            Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
        }

        boolean leapYear;

        public boolean isLeapYear() {
            return leapYear;
        }

        public void setLeapYear(boolean leapYear) {
            this.leapYear = leapYear;
        }

        public int getDay() {
            return day;
        }

        public  void setDay(int day) {
            Date.day = day;
        }

        public  int getMonth() {
            return month;
        }

        public  void setMonth(int month) {
            Date.month = month;
        }

        public  int getYear() {
            return year;
        }

        public  void setYear(int year) {
            Date.year = year;
        }

        private static int day;
        private static int month;
        private static int year;


        public Date(int day, int month, int year) {
            Date.day = day;
            Date.month = month;
            Date.year = year;

        }

        public DayOfWeek getDayOfweek() {
//для данной формулы нумерация дней недели начинается с воскресенья - 0, понедельник - 1, ...суббота - 6.
//нумерация месяцев начинается с марта - 1, апрель - 2, ...январь - 11, февраль - 12.
            int c = year / 100;

            if (month < 3 && year%100 == 0){ //если месяц январь и февраль и столетие нулевое, т.е 00, например 1900
                --c;//берем предыдущее столетие, т.е 18
                --year;// 1899
                month += 10; //месяц февраль станет 12
            }else if (month >= 3 &&year%100 == 0){ //если месяц от марта и далее и столетие так же нулевое
                --c;//берем предыдущее столетие, т.е 18
                month -= 2; //уменьшаем значение месяца на 2
            }else if (month < 3){ //если месяц меньше 3 и любой другой год
                --year; //год уменьшаем на 1
                month += 10; //значение месяца увеличиваем на 10
            } else //если не удовлетворяем этим условиям
                month -= 2;

            int y = year - c* 100; //количество лет в столетии
            int w = (day + (13 * month - 1) / 5 + y + y / 4 + c / 4 - 2 * c) % 7;
            //System.out.println(w);

            for (DayOfWeek num : DayOfWeek.values()) {
                if (w == num.ordinal()) {
                    return num;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Date date1 = new Date(16, 1, 2000);


        System.out.println(date1.getDayOfweek());

    }
}
