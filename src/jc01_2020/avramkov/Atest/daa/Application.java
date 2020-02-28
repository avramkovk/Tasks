package jc01_2020.avramkov.Atest.daa;

public class Application {

    public static class Date {
        private  static int day;
        private  static int month;
        private  static int year;
        private  static int getDayOfYear;
        private  static int getDays;
        boolean leapYear;

        public Date(int day, int month, int year){
            Date.day =day;
            Date.month =month;
            Date.year =year;
            leapYear = new Year().leapYear();
            getDayOfYear = new Year().getDayOfYear();
            System.out.println("Заданная дата: "+day+"."+month+"."+year);
        }

        public static DayOfWeek valueOf (int index){
            DayOfWeek Day = null;
            for (DayOfWeek s: DayOfWeek.values()) {
                if (s.getNumber() == index){  Day = s; }
            }
            return  Day;
        }

        public DayOfWeek getDayOfWeek() {
            int k = year-(14-month)/12;
            int n = (day+31*(month+12*((14-month)/12)-2)/12+k+k/4-k/100+k/400)%7;
            return valueOf(n);
        }

        public int daysBetween(Date endDate){
            return 1;
        }

        public boolean leapYear() {
            return leapYear;
        }
        public int getDayOfYear() {
            return getDayOfYear;
        }

        static class Year{
            public boolean leapYear(){
                return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
            }
            private int getDayOfYear(){
                if (!leapYear()) { return 365;} else {return  366;}
            }

        }

        static class Month{
            public int getDays(int monthNumber, boolean leapYear){
                if (monthNumber==2){ return leapYear?28:29; }
                else return monthNumber%2==1?31:30;
            }
        }

        static class Day{
        }
        public static void main(String[] args) {
            Date date1=new Date(28,2,2020);
            Date date2 = new Date(30,5,2023);
            System.out.println("День недели-"+ date1.getDayOfWeek());
            System.out.println("Год високосный: "+date1.leapYear());
            System.out.println("Количество дней в году: "+date1.getDayOfYear());
            Date.Month month1= new Application.Date.Month();
            System.out.println(month1.getDays(1,true));
            date1.daysBetween(date2);
        }

    }
}

