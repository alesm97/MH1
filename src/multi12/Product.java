package multi12;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Product {

    private ReentrantReadWriteLock locker = new ReentrantReadWriteLock();
    private double cost;

    public Product(double cost) {
        this.cost = cost;
    }

    public double getCost(int id) {

        if (locker.readLock().tryLock()) {
            System.out.printf("Consumidor %d ha accedido al precio. Precio: %.2f\n", id, cost);

            locker.readLock().unlock();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } else {
            System.out.printf("Consumidor %d ha intentado acceder al precio.\n", id);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


        return cost;
    }

    public void increaseCost(double increase) {

        if (locker.writeLock().tryLock()) {
            cost += increase;
            System.out.printf("Precio aumentado (+%.2f), precio actual = %.2f\n", increase, cost);
            locker.writeLock().unlock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.printf("Se ha intentado subir el precio pero no se ha podido.\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
