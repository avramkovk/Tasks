package jc01_2020.avramkov.lesson06.task02;

import java.util.Scanner;

public class MoneyOfBankomat {

    int allMoney = 100_000;
    int userPayment;
    int money20;
    int money50;
    int money100;

    public MoneyOfBankomat() {
    }

    //для снятия денег с банкомата
    public MoneyOfBankomat(int userPayment) {
        this.userPayment = userPayment;
    }

    //для добавления денег в банкомат
    public MoneyOfBankomat(int money20, int money50, int money100) {
        this.money20 = money20;
        this.money50 = money50;
        this.money100 = money100;
    }

    public void getUserPayment() { //метод для снятия наличных
        money100 = userPayment / 100;
        money50 = (userPayment - money100 * 100) / 50;
        money20 = (userPayment - money100 * 100 - money50 * 50) / 20;
        int balance = userPayment - money100 * 100 - money50 * 50 - money20 * 20;

        if (userPayment < allMoney) {
            if (balance > 20) {
                if (userPayment % money100 == 0) {
                    System.out.println("Количество 100 рублевых купюр: " + money100);
                    System.out.println("Количество 50 рублевых купюр: " + money50);
                    System.out.println("Количество 20 рублевых купюр: " + money20);
                } else if (userPayment % money50 == 0) {
                    System.out.println("Количество 100 рублевых купюр: " + money100);
                    System.out.println("Количество 50 рублевых купюр: " + money50);
                    System.out.println("Количество 20 рублевых купюр: " + money20);
                } else if (userPayment % money20 == 0) {
                    System.out.println("Количество 100 рублевых купюр: " + money100);
                    System.out.println("Количество 50 рублевых купюр: " + money50);
                    System.out.println("Количество 20 рублевых купюр: " + money20);
                }
            } else if (balance < 20)
                System.out.println("В банкомате отсутствуют купюры номиналом менее 20 рублей. Введите другую сумму.");
        }else System.out.println("В банкомате недостаточно денег");



        }

    public void addMoneyToBankomat() {
        Scanner input = new Scanner(System.in);



        System.out.println("Добавлено:");
        System.out.println("Добавлено 20-рублевых купюр: " + money20);
        System.out.println("Добавлено 50-рублевых купюр: " + money50);
        System.out.println("Добавлено 100-рублевых купюр: " + money100);
    }
}
