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

    int getFullSeconds(){
        return seconds + 60*minutes + 60*60*hours;
    }



}
