package multi12;

public class Buyer implements Runnable {

    Product product;
    int id;

    public Buyer(Product product, int id) {
        this.product = product;
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            product.getCost(id);
        }
    }
}
