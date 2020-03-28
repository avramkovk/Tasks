package jc01_2020.avramkov.Atest;

import java.io.FileInputStream;
import java.io.FileReader;

public class T {
    public static void main(String[] args) throws Exception {
        FileReader fis = new FileReader("resource/test.txt");
        FileInputStream fis1 = new FileInputStream("resource/test.txt");


        while (fis.ready()) {
            int data = fis.read();
            System.out.print(data);
            System.out.print(" ");
        }
        System.out.println("-------------------");
        while (fis1.read()!=-1) {
            int data = fis1.read();
            System.out.print(data);
            System.out.print(" ");
        }
    }
}
