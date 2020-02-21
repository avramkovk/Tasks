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

            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }

        boolean leapYear;

        public boolean LeapYear() {
            return leapYear;
        }


        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            Date.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            Date.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            Date.year = year;
        }

        private static int day;
        private static int month;
        private static int year;

        Date(){

        }
        public Date(int day, int month, int year) {

            Date.day = day;
            Date.month = month;
            Date.year = year;
            leapYear = new Year().leapYear();
        }

        public DayOfWeek getDayOfWeek() {
            //нумерация дней недели начинается с воскресенья - 0, понедельник - 1, ...пятница - 5, суббота - 6.
            //нумерация месяцев начинается с марта - 1, апрель - 2, ...январь - 11, февраль - 12.
            int c = year / 100;

            if (month < 3 && year % 100 == 0) { //если месяц январь и февраль и столетие нулевое, т.е 00, например 1900
                --c;//берем предыдущее столетие, т.е 18
                --year;// 1899
                month += 10; //месяц февраль станет 12
            } else if (month >= 3 && year % 100 == 0) { //если месяц от марта и далее и столетие так же нулевое
                --c;//берем предыдущее столетие, т.е 18
                month -= 2; //уменьшаем значение месяца на 2
            } else if (month < 3) { //если месяц меньше 3 и любой другой год
                --year; //год уменьшаем на 1
                month += 10; //значение месяца увеличиваем на 10
            } else //если не удовлетворяем этим условиям
                month -= 2;

            int y = year - c * 100; //количество лет в столетии
            int w = (day + (13 * month - 1) / 5 + y + y / 4 + c / 4 - 2 * c) % 7;
            //System.out.println(w);

            for (DayOfWeek num : DayOfWeek.values()) {
                if (w == num.ordinal()) {
                    return num;
                }
            }
            return null;
        }
        public int getDayOfYear(){
            if(leapYear) return 356;
            else return 355;
        }


        static class Year {

            public boolean leapYear() {
                if (year % 4 == 0 && year % 100 != 0) {
                    return true;
                } else return year % 400 == 0;
            }

            static class Month {
                public static int day=0;

                public static int getDays(int month, boolean leapYear) {
                    int day = 0;
                    if (1 <= month && month <= 12)
                        switch (month) {
                            case 1:
                                day = 31;
                                break;
                            case 2:
                                if (leapYear) day = 29;
                                else day = 28;
                                break;
                            case 3:
                                day = 31;
                                break;
                            case 4:
                                day = 30;
                                break;
                            case 5:
                                day = 31;
                                break;
                            case 6:
                                day = 30;
                                break;
                            case 7:
                                day = 31;
                                break;
                            case 8:
                                day = 31;
                                break;
                            case 9:
                                day = 30;
                                break;
                            case 10:
                                day = 31;
                                break;
                            case 11:
                                day = 30;
                                break;
                            case 12:
                                day = 31;
                                break;
                            default:
                                day = 0;
                        }
                    return day;
                }

                static class Day{

                }
            }

        }
    }

    public static void main(String[] args) {
        Date date1 = new Date(16, 88, 2020);

        System.out.println(date1.leapYear);//проверка года на високосность
        System.out.println(date1.getDayOfYear());//вывод количества дней в году
        System.out.println(date1.getDayOfWeek()); //вывод дня недели по дате


    }
}
