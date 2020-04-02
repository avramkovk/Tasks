package jc01_2020.avramkov.Atest.aaaaaaaaa;

public class Main {
    public static void main(String[] args) {

        String prodUrl = Environment.PROD.getUrl();
        String devUrl = Environment.DEV.getUrl();

        System.out.println("Production url is: " + prodUrl);
        System.out.println("Development url is: " + devUrl);

    }
}