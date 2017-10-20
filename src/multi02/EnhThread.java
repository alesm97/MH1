package multi02;

public class EnhThread extends Thread{

    Counter c;

    public EnhThread(Counter c) {
        this.c=c;
    }

    public void run(){
        int repeats=0;
        while(repeats<10000){
            c.aumentar();
            repeats++;
        }
    }

}
