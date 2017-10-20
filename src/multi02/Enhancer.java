package multi02;

public class Enhancer {

    public static void main(String[] args) throws InterruptedException {

        Thread[] threadsArray = new Thread[3];
        Counter counter = new Counter();

        for(int x=0;x<=2;x++){
            threadsArray[x]= new EnhThread(counter);
        }

        for(int x=0;x<=2;x++){
            threadsArray[x].start();
        }

        for(int x=0;x<=2;x++){
            threadsArray[x].join();
        }



        System.out.printf("%d",counter.cuenta);
    }

}
