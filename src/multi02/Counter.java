package multi02;

public class Counter {

    Integer cuenta=0;

    public synchronized void aumentar(){
        cuenta++;
    }

}
