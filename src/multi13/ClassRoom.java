package multi13;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class ClassRoom {

    private final int NUMB_COMPUTER = 5;
    public final static boolean available[] = {true,true,true,true,true};
    Semaphore semaphore = new Semaphore(5,true);
    ReentrantLock lock = new ReentrantLock();

    Random rnd = new Random();

    public void pickPc(){

        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        doExam();
    }
    public void doExam(){

    }


}
