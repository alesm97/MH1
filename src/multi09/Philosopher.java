package multi09;

public class Philosopher implements Runnable{

    String name;
    Chopstick chopstickLeft;
    Chopstick chopstickRight;
    boolean par;

    public Philosopher(String name, Chopstick chopstickLeft, Chopstick chopstickRight, boolean par) {
        this.name=name;
        this.chopstickLeft = chopstickLeft;
        this.chopstickRight = chopstickRight;
        this.par=par;
    }


    @Override
    public void run() {

        while(true){

            if(par){
                if(chopstickLeft.tryPick(this)){
                    if(chopstickRight.tryPick(this)){
                        try {
                            System.out.printf("Philosopher %s eating ^^%n",name);
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        chopstickRight.leftChopstick(this);
                        chopstickLeft.leftChopstick(this);
                    }else{
                        System.out.printf("Philosopher %s couldn't take %s chopstick and has left the other one.",name,chopstickLeft.number);
                        chopstickLeft.leftChopstick(this);
                    }
                }else{

                }
            }else{
                if(chopstickRight.tryPick(this)){
                    if(chopstickLeft.tryPick(this)){
                        try {
                            System.out.printf("Philosopher %s eating ^^%n",name);
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        chopstickLeft.leftChopstick(this);
                        chopstickRight.leftChopstick(this);
                    }else{
                        System.out.printf("Philosopher %s couldn't take %s chopstick and has left the other one.",name,chopstickLeft.number);
                        chopstickRight.leftChopstick(this);
                    }
                }else{


                }


            }
        }


    }
}
