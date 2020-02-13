package jc01_2020.avramkov.lesson07.task01;

public class Pyramid extends Shape {

	private double side;
	private double height;

	public Pyramid(double side, double height) {
		this.side = side;
		this.height = height;
		this.setVolume(getVolume());
	}

	@Override
	public double getVolume() {
		return  ((side * side) * height)/3;
	}
}
