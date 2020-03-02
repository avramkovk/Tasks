package jc01_2020.avramkov.Atest.Employee;

import java.time.LocalDate;
import java.util.ArrayList;

public class Employee {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    boolean isNotified;


    public Employee(String name, LocalDate startDate, int years) {
        this.name = name;
        this.startDate = startDate;
        endDate = startDate.plusYears(years);
    }

    public void fire() {
        endDate = LocalDate.now();
    }

    public void notified() {
        isNotified = true;
    }

    public String checkTerm(LocalDate now) {
        if (!isNotified && !now.isAfter(endDate) && !now.plusDays(60).isBefore(endDate)) {
            return name + ", тебя скоро уволят";
        }return null;
    }
    public boolean isFire(LocalDate now) {
        return !isNotified && !now.isAfter(endDate) && !now.plusDays(60).isBefore(endDate);

    }

}
