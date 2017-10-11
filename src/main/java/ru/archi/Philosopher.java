package main.java.ru.archi;

/**
 * Created by Черный on 11.10.2017.
 */
public class Philosopher {
    private int numberPhilosopher;
    private Fork[] forks;
    private Fork[] takenForks = new Fork[2];

    public Philosopher(Fork[] forks, int numberPhilosopher) {
        this.forks = forks;
        this.numberPhilosopher = numberPhilosopher;
    }

    public void act(){
        int forkCount = 0;
        int attemptsToTake = 0;
        while (forkCount < 2){
            for(int i=0; i<5; i++){
                if(forkCount < 2 && forks[i].takeFork()){
                    takenForks[forkCount++] = forks[i];
                }else {
                    attemptsToTake++;
                    if(attemptsToTake > 10) {
                        putForks();
                        forkCount = 0;
                    }
                }
            }
        }

        eat();
        putForks();
        think();
    }

    private void putForks(){
        if (takenForks[0] != null) {
            takenForks[0].putFork();
        }
        if (takenForks[1] != null) {
            takenForks[1].putFork();
        }
    }

    private void eat(){
        System.out.println("Philosopher "+ numberPhilosopher +" eating");
    }

    private void think(){
        System.out.println("Philosopher "+ numberPhilosopher +" thinking");
    }
}
