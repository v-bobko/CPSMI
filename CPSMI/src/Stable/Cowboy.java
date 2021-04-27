package Stable;

import java.util.Random;

public class Cowboy extends Thread {
    public void run() {
        Random t = new Random();

        while (true) {
            if (Stable.horses > 0) {
                try {
                    Thread.sleep(t.nextInt(50));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (Stable.class) {
                    Stable.horses--;
                    try {
                        Thread.sleep(t.nextInt(50));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //System.out.println("Выполняю квест..." + Thread.currentThread().getName());
                    Stable.horses++;
                    if (Stable.horses < 0) {
                        System.out.println("!!!!!!! Лошадь взяли в минус" + Stable.horses);
                        System.exit(0);
                    }
                }
            }
        }
    }
}
