package jc01_2020.avramkov.lesson14.task02;

/*
 *
 * При помощи FileReader И FileInputStream прочитать содержимое созданного в первом задании файла, убедиться, что они совпадают.
 *
 */

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("Чтение из файла посредством FileReader:");
		try {
			Reader reader = new FileReader("src\\jc01_2020\\avramkov\\lesson14\\resource\\lesson14-01.txt");
			Scanner scanner = new Scanner(reader);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			reader.close();
			scanner.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("--------------------------------------------");
		System.out.println("Чтение из файла посредством FileInputStream:");

		try {
			InputStream fis = new FileInputStream("src\\jc01_2020\\avramkov\\lesson14\\resource\\lesson14-01.txt");
			Scanner scanner = new Scanner(fis);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
