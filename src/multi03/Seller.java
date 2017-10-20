package multi03;

public class Seller {

    public static void main(String[] args) throws InterruptedException {
        Cinema cinema = new Cinema(100);
        Buyer buyer1 = new Buyer(cinema,5,3);
        Buyer buyer2 = new Buyer(cinema,8,2);

        buyer1.start();
        buyer2.start();
        buyer1.join();
        buyer2.join();

        System.out.printf("Free Chairs: %d%n",cinema.chairs);

    }

}
