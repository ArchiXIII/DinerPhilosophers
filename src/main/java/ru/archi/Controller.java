package main.java.ru.archi;

/**
 * Created by Черный on 11.10.2017.
 */
public class Controller {
    public static void main(String[] args) {
        Fork[] forks = new Fork[5];
        for(int i=0; i<5; i++) {
            forks[i] = new Fork();
        }

        for (int i=0; i<5; i++) {
            int numberPhilosopher = i;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Philosopher philosopher = new Philosopher(forks, numberPhilosopher);
                    while (true) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        philosopher.act();
                    }
                }
            });
            thread.start();
        }
    }
}
