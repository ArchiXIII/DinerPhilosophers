package main.java.ru.archi;

/**
 * Created by Черный on 11.10.2017.
 */
public class Fork {
    private boolean taken = false;

    public synchronized boolean takeFork(){
        if(!taken){
            taken = true;
            return true;
        }
        return false;
    }

    public synchronized void putFork(){
        taken = false;
    }
}
