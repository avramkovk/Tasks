package jc01_2020.avramkov.lesson06.task02;

import java.util.Scanner;

public class AppBankomat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


int num = 1;
while(num != 0) {
    System.out.println("---------------------------------------------------");
    System.out.println("Введите номер операции:");
    System.out.println("0. Выход.");
    System.out.println("1. Снятие наличных.");
    System.out.println("2. Добавление наличных.");
    num = sc.nextInt();


    switch (num) {           //снятие денег
        case 1:
            MoneyOfBank newPayment = new MoneyOfBank(MoneyOfBank.userPayment);
            newPayment.getUserPayment();
            System.out.println("Остаток денег в банкомате: " + newPayment.getAllMoney() + " рублей");
            break;
        case 2:             //добавление денег

            MoneyOfBank addMoney = new MoneyOfBank(MoneyOfBank.money20, MoneyOfBank.money50, MoneyOfBank.money100);
            addMoney.addMoneyToBankomat();
            System.out.println("Остаток денег в банкомате: " + addMoney.getAllMoney() + " рублей");
            break;

        case 0: break;
    }
}




    }
}

