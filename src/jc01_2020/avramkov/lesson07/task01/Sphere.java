package jc01_2020.avramkov.lesson07.task01;

public class Sphere extends Shape {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
        this.setVolume(getVolume());
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
}
