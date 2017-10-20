package multi09;

public class Chopstick {

    int number;
    boolean taken=false;

    public Chopstick(int number) {
        this.number=number;
    }



    public synchronized boolean tryPick(Philosopher philosopher){
        boolean done = false;
        if(taken==true){
            System.out.printf("Philosopher %s try to take chopstick %d but it was taken :(%n",philosopher.name,number);
        }else{
            taken=true;
            done=true;
            System.out.printf("Philosopher %s has taken chopstick %d.%n",philosopher.name,number);
        }
        return done;
    }

    public synchronized void leftChopstick(Philosopher philosopher){
        taken=false;
        System.out.printf("Philosopher %s has left chopstick %d.%n",philosopher.name,number);
    }



}
