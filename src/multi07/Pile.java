package multi07;

import java.util.ArrayList;

public class Pile {

    String name;

    public Pile(String name) {
        this.name = name;
    }

    ArrayList<Dish> dishes = new ArrayList<Dish>();

    public synchronized void takeDish(int counter) {
        while(dishes.size()==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dishes.remove(dishes.size()-1);
        System.out.printf("Dish taken from pile %s %d%n",name,counter);
    }

    public synchronized void putDish(int counter){
        dishes.add(new Dish());
        notifyAll();
        System.out.printf("Dish placed on %s %d%n",name,counter);
    }

}
