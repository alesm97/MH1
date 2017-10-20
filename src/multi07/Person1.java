package multi07;

public class Person1 implements Runnable{

    Pile pile;

    public Person1(Pile pile) {
        this.pile = pile;
    }

    @Override
    public void run() {

        for(int counter=1;counter<=50;counter++){
            pile.putDish(counter);
        }

    }
}
