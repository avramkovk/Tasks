package jc01_2020.avramkov.lesson07.task01;

public class Parallelepiped extends Shape{

	private double height;
	private double width;
	private double length;

	public Parallelepiped(double height, double width, double length) {
		this.height = height;
		this.width = width;
		this.length = length;
		this.setVolume(getVolume());
	}

	@Override
	public double getVolume() {
		return height * width * length;
	}
}
