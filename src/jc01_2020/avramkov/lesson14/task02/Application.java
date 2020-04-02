package jc01_2020.avramkov.lesson14.task02;

/*
 *
 * При помощи FileReader И FileInputStream прочитать содержимое созданного в первом задании файла, убедиться, что они совпадают.
 *
 */

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src\\jc01_2020\\avramkov\\lesson14\\resource\\lesson14-01.txt");
            List<Character> listFr = new ArrayList<>();
            while (fr.read() != -1) {
                listFr.add((char) fr.read());
            }

            InputStreamReader ISR = new InputStreamReader(new FileInputStream("src\\jc01_2020\\avramkov\\lesson14\\resource\\lesson14-01.txt"));
            List<Character> listISR = new ArrayList<>();
            while (ISR.read() != -1) {
                listISR.add((char) ISR.read());
            }
            System.out.println(listFr.containsAll(listISR));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}