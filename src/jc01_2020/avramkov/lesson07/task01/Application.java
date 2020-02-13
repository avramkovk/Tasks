package jc01_2020.avramkov.lesson07.task01;

/*
 *
 * Собираем чемодан
 *
 * Класс Box является контейнером, он можем содержать в себе другие фигуры. Реализовать в нем конструктор, в который
 * передается объем коробки, и метод add(), который принимает на вход Shape и кладет в коробку.
 * Нужно добавлять новые фигуры до тех пор, пока для них хватает места в Box (будем считать только объём, игнорируя форму.
 * Допустим, мы переливаем жидкость). Если места для добавления новой фигуры не хватает, то метод должен вернуть false.
 * Все сущности должны являть наследниками класса Shape.
 * Параллелепипед - прямоугольный
 *
 */

public class Application {

    public static void main(String[] args) {
        Box box = new Box();
        box.setVolume(100d);

        System.out.println("Cylinder");
        Cylinder cylinderFigure = new Cylinder(2, 1);
        System.out.println(box.add(cylinderFigure));
        System.out.println("volume " + cylinderFigure.getVolume());
        System.out.println("free box volume " + box.getVolume());
        System.out.println("-------------------------------------------------------------");

        System.out.println("Parallelepiped");
        Parallelepiped parallelepipedFigure = new Parallelepiped(1, 2, 3);
        System.out.println(box.add(parallelepipedFigure));
        System.out.println("volume " + parallelepipedFigure.getVolume());
        System.out.println("free box volume " + box.getVolume());
        System.out.println("-------------------------------------------------------------");

        System.out.println("Pyramid");
        Pyramid pyramiddFigure = new Pyramid(1, 3);
        System.out.println(box.add(pyramiddFigure));
        System.out.println("volume " + pyramiddFigure.getVolume());
        System.out.println("free box volume " + box.getVolume());
        System.out.println("-------------------------------------------------------------");

        System.out.println("Sphere");
        Sphere sphereFigure = new Sphere(1);
        System.out.println(box.add(sphereFigure));
        System.out.println("volume " + sphereFigure.getVolume());
        System.out.println("free box volume " + box.getVolume());

    }
}