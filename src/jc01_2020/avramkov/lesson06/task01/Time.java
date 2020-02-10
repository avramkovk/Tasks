package jc01_2020.avramkov.lesson06.task01;

public class Time {
    byte seconds;
    byte minutes;
    byte hours;

    public Time() {
    }

    public Time(byte seconds, byte minutes, byte hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getFullSeconds() {
        return seconds + 60 * minutes + 60 * 60 * hours;

    }

    //сравнение времени
    public int compareTime(Time newTime) {

        if (newTime.getFullSeconds() == this.getFullSeconds()) {
            return 0;

        } else if (newTime.getFullSeconds() > this.getFullSeconds()) {
            return 1;
        }

        return -1;
    }

//метод вывода на экран количества секунд
    public void secondToDisplay() {
        System.out.println(this.getFullSeconds());
    }
}



