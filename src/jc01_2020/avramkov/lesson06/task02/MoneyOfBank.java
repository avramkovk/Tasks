package jc01_2020.avramkov.lesson06.task02;

import java.util.Scanner;

public class MoneyOfBank {
    public int getAllMoney() {
        return allMoney;
    }

    static int allMoney = 1000;
    static int userPayment;
    static int money20;
    static int money50;
    static int money100;

    public MoneyOfBank() {
    }

    //для снятия денег с банкомата
    public MoneyOfBank(int userPayment) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        MoneyOfBank.userPayment = sc.nextInt();
    }

    //для добавления денег в банкомат
    public MoneyOfBank(int money20, int money50, int money100) {
        MoneyOfBank.money20 = money20;
        MoneyOfBank.money50 = money50;
        MoneyOfBank.money100 = money100;
    }

    public void getUserPayment() { //метод для снятия наличных
        money100 = userPayment / 100;
        money50 = (userPayment - money100 * 100) / 50;
        money20 = (userPayment - money100 * 100 - money50 * 50) / 20;
        int balance = userPayment - money100 * 100 - money50 * 50 - money20 * 20;

        if (userPayment < allMoney || userPayment == allMoney) {
            if (balance == 0 || balance >= 20) {
                if (userPayment % 100 == 0) {
                    System.out.println("Количество 100 рублевых купюр: " + money100);
                    System.out.println("Количество 50 рублевых купюр: " + money50);
                    System.out.println("Количество 20 рублевых купюр: " + money20);
                } else if (userPayment % 50 == 0) {
                    System.out.println("Количество 100 рублевых купюр: " + money100);
                    System.out.println("Количество 50 рублевых купюр: " + money50);
                    System.out.println("Количество 20 рублевых купюр: " + money20);
                } else if (userPayment % 20 == 0) {
                    System.out.println("Количество 100 рублевых купюр: " + money100);
                    System.out.println("Количество 50 рублевых купюр: " + money50);
                    System.out.println("Количество 20 рублевых купюр: " + money20);
                }
                allMoney = allMoney - userPayment;
            } else System.out.println("В банкомате отсутствуют купюры номиналом менее 20 рублей. Введите другую сумму.");
        } else System.out.println("В банкомате недостаточно денег");
    }

    public void addMoneyToBankomat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество 20 рублевых купюр: ");
        MoneyOfBank.money20 = sc.nextInt();
        System.out.println("Введите количество 50 рублевых купюр: ");
        MoneyOfBank.money50 = sc.nextInt();
        System.out.println("Введите количество 100 рублевых купюр: ");
        MoneyOfBank.money100 = sc.nextInt();

        System.out.println("Добавлено:");
        System.out.println("Добавлено 20-рублевых купюр: " + money20);
        System.out.println("Добавлено 50-рублевых купюр: " + money50);
        System.out.println("Добавлено 100-рублевых купюр: " + money100);

        allMoney = allMoney + money20 * 20 + money50 * 50 + money100 * 100;
    }
}