package jc01_2020.avramkov.Atest.daa;

public enum DayOfWeek {

    Monday(0),
    Tuesday(1),
    Wednesday(2),
    Thursday(3),
    Friday(4),
    Saturday(5),
    Sunday(-1);
    int number;
    DayOfWeek(int number){
        this.number=number;
    }
    public int getNumber(){
        return number+1;
    }
}
