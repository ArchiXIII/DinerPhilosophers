package main.java.ru.archi;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Черный on 11.10.2017.
 */
public class Fork {
    private boolean taken = false;

    public boolean takeFork(){
        if(!taken){
            taken = true;
            return true;
        }
        return false;
    }

    public void putFork(){
        taken = false;
    }
}
