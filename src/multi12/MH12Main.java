package multi12;

public class MH12Main {

    public static void main(String[] args) {

        Product product = new Product(200);
        Shop shop = new Shop(product);
        Buyer[] buyers = new Buyer[10];

        for(int i = 1 ; i<11; i++){
            buyers[i-1]=new Buyer(product,i);
        }

        new Thread(shop).start();

        for(int i = 0; i < buyers.length ; i++){
            new Thread(buyers[i]).start();
        }

    }

}
