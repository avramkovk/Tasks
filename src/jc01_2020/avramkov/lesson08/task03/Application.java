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

import java.text.SimpleDateFormat;

public class Application {
    public static class Date {

        private int day;
        private int month;
        private int year;

        public Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay() {
            return this.day;
        }

        public int getNumberMonth() {
            return this.month;
        }

        public int getYear() {
            return this.year;
        }

        class Year {
            public boolean leapYear() {
                return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
            }
            public int getDayOfYear() {
                if (leapYear()) return 366;
                else return 365;
            }

            class Month {
                public MonthName getNameMonth() {
                    int m = month - 1;
                    for (MonthName monthName : MonthName.values()) {
                        if (m == monthName.ordinal()) {
                            return monthName;
                        }
                    }
                    return null;
                }
                public int getMonthDays() {
                    int [] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
                    daysInMonths[1] += leapYear() ? 1 : 0;
                    return daysInMonths[month-1];
                }

                class Day {
                    public DayOfWeek getDayOfWeek() {
                        //для этой формулы
                        //нумерация дней недели начинается с воскресенья - 0, понедельник - 1, ...пятница - 5, суббота - 6.
                        //нумерация месяцев начинается с марта - 1, апрель - 2, ...январь - 11, февраль - 12.

                        int myDay = day;
                        int myMonth = month;
                        int myYear = year;
                        int century = year / 100; //количество столетий

                        if (myMonth < 3 && myYear % 100 == 0) { //если месяц январь и февраль и столетие нулевое, т.е 00, например 1900
                            --century;//берем предыдущее столетие, т.е 18
                            --myYear;// 1899
                            myMonth += 10; //месяц февраль станет 12
                        } else if (myMonth >= 3 && myYear % 100 == 0) { //если месяц от марта и далее и столетие так же нулевое
                            --century;//берем предыдущее столетие, т.е 18
                            myMonth -= 2; //уменьшаем значение месяца на 2
                        } else if (myMonth < 3) { //если месяц меньше 3 и любой другой год
                            --myYear; //год уменьшаем на 1
                            myMonth += 10; //значение месяца увеличиваем на 10
                        } else //если не удовлетворяем этим условиям
                            myMonth -= 2;

                        int y = myYear - century * 100; //количество лет в столетии
                        int w = (myDay + (13 * myMonth - 1) / 5 + y + y / 4 + century / 4 - 2 * century) % 7;

                        for (DayOfWeek num : DayOfWeek.values()) {
                            if (w == num.ordinal()) {
                                return num;
                            }
                        }
                        return null;
                    }
                }
            }
        }
    }

    static void daysBetween(Date startDate, Date endDate) {     //метод посчета разницы дат
        StringBuilder sbDate1 = new StringBuilder();
        sbDate1.append(startDate.getDay()).append(".").append(startDate.getNumberMonth()).append(".").append(startDate.getYear());

        StringBuilder sbDate2 = new StringBuilder();
        sbDate2.append(endDate.getDay()).append(".").append(endDate.getNumberMonth()).append(".").append(endDate.getYear());

        String sdate1 = new String(sbDate1);
        String sdate2 = new String(sbDate2);

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        java.util.Date dateOne = null;
        java.util.Date dateTwo = null;

        try {
            dateOne = format.parse(sdate1);
            dateTwo = format.parse(sdate2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assert dateOne != null;
        assert dateTwo != null;

        long difference = Math.abs(dateOne.getTime() - dateTwo.getTime());// Количество дней между датами в миллисекундах
        long i = difference / (24 * 60 * 60 * 1000);// Перевод количества дней между датами из миллисекунд в дни
        System.out.println("Разница дат равна " + i + " дн.");
    }

    public static void main(String[] args) {
        Date date1 = new Date(28, 12, 2020);
        Date date2 = new Date(10, 12, 2020);

        Date.Year year1 = date1.new Year();
        Date.Year.Month month1 = year1.new Month();
        Date.Year.Month.Day day1 = month1.new Day();

        daysBetween(date1, date2);

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Характеристика даты " + date1.getDay() + "." + date1.getNumberMonth() + "." + date1.getYear());
        System.out.println("Год високосный? - " + year1.leapYear());
        System.out.println("В году дней " + year1.getDayOfYear());
        System.out.println("Месяц " + month1.getNameMonth());
        System.out.println("Дней в месяце " + month1.getMonthDays());
        System.out.println("День недели " + day1.getDayOfWeek());
    }
}