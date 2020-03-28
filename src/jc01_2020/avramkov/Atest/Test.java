package jc01_2020.avramkov.Atest;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {

        // Example 1 - Reading File's content using FileInputStream
        try (FileInputStream fis = new FileInputStream("resource/lesson14-01.txt")) {
            int data = fis.read();
            int count = 0;
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
                count++;
            }        System.out.println(count);

        } catch (IOException e) {
            System.out.println("Failed to read binary data from File");
            e.printStackTrace();
        }
        System.out.println("____________");
        // Example 2 - Reading File data using FileReader in Java
        try (FileReader reader = new FileReader("resource/lesson14-01.txt")) {
            int character = reader.read();
            int count1 = 0;

            while (character != -1) {
                System.out.print((char) character);
                character = reader.read();
                count1++;
            }
            System.out.println(count1);
        } catch (IOException io) {
            System.out.println("Failed to read character data from File");
            io.printStackTrace();
        }
        System.out.println();
    }
}