package jc01_2020.avramkov.test01;

/*
 *
 * Считать из консоли строку, состоящую из цифр.
 * Вычислить firstSum как сумму каждого четвертого элемента. В сумму включать только те цифры, которые больше 5
 * Вычислить secondSum как сумму каждого второго элемента. В сумму включать только те цифры, которые меньше 5
 * Вывести в консоль большее из значений firstSum и secondSum или слово "равны", если они совпадают
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Comparision {
	public static void main(String[] args) {

        int firstSum = 0;
        int secondSum = 0;

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

       arrayList.add(Integer.parseInt(arr[i]));

        }
        System.out.print(arrayList);

        for (int i = 0; i <arrayList.size() ; i++) {
            if((i+1)%4 ==0){
                if(arrayList.get(i) >5){
                    firstSum = firstSum + arrayList.get(i);
                }

            }
        }

        for (int i = 0; i <arrayList.size() ; i++) {
            if((i+1)%2 ==0){
                if(arrayList.get(i) <5){
                    secondSum = secondSum + arrayList.get(i);
                }

            }
        }


        System.out.println(firstSum);
        System.out.println(secondSum);
        compare(firstSum,secondSum);

        }
        static void compare( int sum1, int sum2){
	    if (sum1 > sum2){
            System.out.println(sum1 + "больше");
        }else if (sum1 < sum2){
            System.out.println(sum2 + "больше");
        } else System.out.println("равны");

        }

	}

