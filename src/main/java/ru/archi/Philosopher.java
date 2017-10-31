package main.java.ru.archi;

/**
 * Created by Черный on 11.10.2017.
 */
public class Philosopher {
    private int numberPhilosopher;
    private Fork leftFork;
    private Fork rightFork;

    public Philosopher(Fork leftForks, Fork rightFork, int numberPhilosopher) {
        this.leftFork = leftForks;
        this.rightFork = rightFork;
        this.numberPhilosopher = numberPhilosopher;
    }

    public void act(){
        synchronized (Philosopher.class) {
            takeForks();
            eat();
            putForks();
            think();
        }
    }

    private void takeForks(){
        leftFork.takeFork();
        rightFork.takeFork();
    }

    private void putForks(){
        leftFork.putFork();
        rightFork.putFork();
    }

    private void eat(){
        System.out.println("Philosopher "+ numberPhilosopher +" eating");
    }

    private void think(){
        System.out.println("Philosopher "+ numberPhilosopher +" thinking");
    }
}
