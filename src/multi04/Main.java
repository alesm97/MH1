package multi04;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Florin();

        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();

    }
}
