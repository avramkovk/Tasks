package jc01_2020.avramkov.lesson07.task01;

public class Box extends Shape{
    private double volume;

   /* public Box(double volume) {
        this.volume = volume;
    }*/

    public boolean add(Shape shape){
        if(volume >= shape.getVolume()){
            volume -= shape.getVolume();
            return true;
        } else{
            return false;
        }
    }

    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }
}
