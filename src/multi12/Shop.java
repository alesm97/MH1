package multi12;

public class Shop implements Runnable {

    Product product;

    public Shop(Product product) {
        this.product=product;
    }

    @Override
    public void run() {
        while (true) {

            product.increaseCost(0.5);

        }
    }
}
