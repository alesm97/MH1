package multi04;

public class Florin extends Thread {

    public void run(){
        while(!this.isInterrupted()){
            System.out.printf("Florín is the best (L) and i'm executing in %s %n",currentThread().getName());
        }
        return;

    }
}
