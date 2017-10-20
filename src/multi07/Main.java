package multi07;

public class Main {

    public static void main(String[] args) {

        Pile pile1 = new Pile("first"), pile2 = new Pile("second");

        Thread[] threads = {new Thread(new Person1(pile1)),new Thread(new Person2(pile1,pile2)),new Thread(new Person3(pile2))};

        for(Thread thread:threads){
            thread.start();
        }

//        for(Thread thread:threads){
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

    }

}
