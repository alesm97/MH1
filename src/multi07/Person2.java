package multi07;

public class Person2 implements Runnable {
    Pile pileIn, pileOut;

    public Person2(Pile pileIn, Pile pileOut) {
        this.pileIn = pileIn;
        this.pileOut = pileOut;
    }

    @Override
    public void run() {

        for(int counter=1;counter<=50;counter++){
            pileIn.takeDish(counter);

            pileOut.putDish(counter);
        }
    }
}
