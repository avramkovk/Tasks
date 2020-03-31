package jc01_2020.avramkov.lesson16.TTT;

import java.util.concurrent.Semaphore;

public class Player extends Thread {
    private final Semaphore SEMAPHORE = new Semaphore(2, true);
    Game game = new Game();

    @Override
    public void run() {

        try {
            SEMAPHORE.acquire();
            game.buildTable();
            game.movePlayer();
            SEMAPHORE.release();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}


