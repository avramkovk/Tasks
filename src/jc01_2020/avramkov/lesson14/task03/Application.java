package jc01_2020.avramkov.lesson14.task03;

/*
 *
 * Создать объект любого пользовательского класса минимум с тремя полями с ненулевыми значениями.
 * Объявить любое поле несериализуемым.
 * Сериализовать этот объект в файл lesson14/resource/<userClassName>.dat.
 *
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Application {

    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\jc01_2020\\avramkov\\lesson14\\resource\\Book.dat"))) {
            File file = new File("src\\jc01_2020\\avramkov\\lesson14\\resource\\");
            boolean created = file.mkdir();
            Book book = new Book("Head First Java", "Sierra Kathy, Bates Bert", 12345);
            oos.writeObject(book);
		} catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}


