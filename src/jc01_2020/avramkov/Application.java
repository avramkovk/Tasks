package jc01_2020.avramkov;

public class Application {

    // Простой вложенный класс
    class Date {
        public void show1() {
            System.out.println("Метод внешнего класса Date");
        }

        class Month {
            public void show2() {
                System.out.println("Метод внутреннего класса Month");
            }
            class Day {
                public void show3() {
                    System.out.println("Метод внутреннего класса Day");
                }
            }
        }
    }

    public static void main(String[] args) {
        Application.Date date = new Application().new Date();
        date.show1();
Application.Date.Month month = date.new Month();
Application.Date.Month.Day day = month.new Day();
    }
}

