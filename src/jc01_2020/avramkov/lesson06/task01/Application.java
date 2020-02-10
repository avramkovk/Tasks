package jc01_2020.avramkov.lesson06.task01;

public class Application {
    public static void main(String[] args) {

        Time time1 = new Time((byte)5,(byte)3,(byte)1);
        Time time2 = new Time((byte)7,(byte)8,(byte)3);

        time1.secondToDisplay(); //вывод на экран количества секунд time1

        System.out.println(time1.compareTime(time2)); //сравнение времени, вывод на экран большего
    }
}
