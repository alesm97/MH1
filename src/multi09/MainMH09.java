package multi09;

public class MainMH09 {

    public static void main(String[] args) {

        Chopstick[] chopsticks = new Chopstick[5];
        Philosopher[] philosophers = new Philosopher[5];
        String[] names = {"Baldomero","Eufrasio","Germán Ginés","Apólito","Landaluce"};

        for(int i = 0 ; i<5 ; i++){
            chopsticks[i] = new Chopstick(i+1);
        }

        for(int i = 0 ; i<5 ; i++){
            if(i==4){
                philosophers[i]=new Philosopher(names[i],chopsticks[i],chopsticks[i+1],true);
            }else{
                if(i%2==0){
                    philosophers[i]=new Philosopher(names[i],chopsticks[i],chopsticks[i+1],true);
                }else{
                    philosophers[i]=new Philosopher(names[i],chopsticks[i],chopsticks[i+1],true);
                }
            }

        }

        for(int i = 0 ; i<5 ; i++){
            new Thread(philosophers[i]).start();
        }



    }

}
