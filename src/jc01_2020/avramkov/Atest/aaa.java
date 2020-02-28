package jc01_2020.avramkov.Atest;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class aaa {
    static void getDifference(Calendar t1, Calendar t2) {
        StringBuilder result = new StringBuilder("> ");
        result.append(t1.get(Calendar.YEAR) > t2.get(Calendar.YEAR) ? t1.get(Calendar.YEAR) - t2.get(Calendar.YEAR)
                : t2.get(Calendar.YEAR) - t1.get(Calendar.YEAR));
        result.append(":");
        result.append(t1.get(Calendar.MONTH) > t2.get(Calendar.MONTH) ? t1.get(Calendar.MONTH) - t2.get(Calendar.MONTH)
                : t2.get(Calendar.MONTH) - t1.get(Calendar.MONTH));
        result.append(":");
        result.append(t1.get(Calendar.DATE) > t2.get(Calendar.DATE) ? t1.get(Calendar.DATE) - t2.get(Calendar.DATE)
                : t2.get(Calendar.DATE) - t1.get(Calendar.DATE));
        System.out.println(result.append(" < ").toString());;
    }

    public static void main(String[] args) {
        Calendar t22 = new GregorianCalendar(2016, 9, 26);
        Calendar t12 = new GregorianCalendar(2013, 8, 13);
        getDifference(t22, t12);
    }


}
