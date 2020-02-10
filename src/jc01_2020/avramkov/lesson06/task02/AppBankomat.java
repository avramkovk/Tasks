package jc01_2020.avramkov.lesson06.task02;

import java.util.Scanner;

public class AppBankomat {
    public static void main(String[] args) {


                MoneyOfBankomat newPayment = new MoneyOfBankomat(183);
                newPayment.getUserPayment();

                //добавление денег
                MoneyOfBankomat addMoney = new MoneyOfBankomat(1,10,30);
                addMoney.addMoneyToBankomat();
    }
}

