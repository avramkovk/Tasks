package jc01_2020.avramkov.lesson14.task02;

/*
 *
 * При помощи FileReader И FileInputStream прочитать содержимое созданного в первом задании файла, убедиться, что они совпадают.
 *
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        try {
            Reader fr = new FileReader("src\\jc01_2020\\avramkov\\lesson14\\resource\\lesson14-01.txt");
            InputStream fis = new FileInputStream("src\\jc01_2020\\avramkov\\lesson14\\resource\\lesson14-01.txt");

            List<String> listFis = new ArrayList<>();
            List<String> listReader = new ArrayList<>();

            Scanner scannerFis = new Scanner(fis);
            Scanner scannerReader = new Scanner(fr);

            while (scannerFis.hasNextLine()) {
                listFis.add(scannerFis.nextLine());
            }

            while (scannerReader.hasNextLine()) {
                listReader.add(scannerReader.nextLine());
            }

            if (listFis.containsAll(listReader)) {
                System.out.println("совпадают");
            } else {
                System.out.println("не совпадают");
            }

            fr.close();
            fis.close();
            scannerFis.close();
            scannerReader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}