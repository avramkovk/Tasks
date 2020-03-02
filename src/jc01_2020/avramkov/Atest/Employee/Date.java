package jc01_2020.avramkov.Atest.Employee;

import java.time.LocalDate;

public class Date {

    LocalDate now;

    public LocalDate getNow() {
        return now;
    }

    public Date(){
        now = LocalDate.now();
    }

    public void increment(){
        now = now.plusDays(1);
    }
}
