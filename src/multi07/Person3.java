package multi07;

public class Person3 implements Runnable {

    Pile pileIn;

    public Person3(Pile pileIn) {
        this.pileIn = pileIn;
    }

    @Override
    public void run() {

        for(int counter=1;counter<=50;counter++){
            pileIn.takeDish(counter);

            if(counter==50){
                System.out.println("All dishes washed and dry.");
            }
        }

    }
}
