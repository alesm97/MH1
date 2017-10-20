package multi05;

public class Main {

    public static void main(String[] args) {
        Thread clock = new Clock();

        clock.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clock.interrupt();

    }
}
