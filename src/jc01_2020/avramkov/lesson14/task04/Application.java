package jc01_2020.avramkov.lesson14.task04;

/*
 *
 * Десериализовать объект из предыдущей задачи. Вывести в консоль значения всех полей
 *
 */


import jc01_2020.avramkov.lesson14.task03.Book;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Application {

    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\jc01_2020\\avramkov\\lesson14\\resource\\Book.dat"))) {
            Book readBook = (Book) ois.readObject();
            System.out.println(readBook.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
