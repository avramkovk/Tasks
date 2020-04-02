package jc01_2020.avramkov.lesson16.TTT;

import java.util.Random;

public class Game {

    private static int SIZE_X = 3;
    private static int SIZE_Y = 3;
    private static final int playerX = 1;
    private static final int playerO = -1;
    private static final int empty = 0;
    private static int[][] table = new int[SIZE_X][SIZE_Y];
    private static Random random = new Random();
    private int randomIntX = Game.random.nextInt(Game.table.length);
    private int randomIntY = Game.random.nextInt(Game.table.length);

    public void buildTable(){
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                 table[i][j] = empty ;
            }
        }
    }
    public void printTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                switch (table[i][j]) {
                    case playerX:
                        System.out.print("X" + " ");
                        break;
                    case playerO:
                        System.out.print("Y" + " ");
                        break;
                    case empty:
                        System.out.print("*" + " ");
                        break;
                }
            }
            System.out.println();
        }
    }

    public void movePlayer() {

        int count = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[i][j] == empty) {
                    count++;
                    table[i][j] = playerX;
                    printTable(Game.table);
                }
                System.out.println("______" + count);
            }
        }
    }
}




