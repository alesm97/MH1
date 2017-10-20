package multi11;

import multi08.Dona;
import multi08.Pastelero;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Plate {

    ArrayList<Dona> donas = new ArrayList<>();

    ReentrantLock lock = new ReentrantLock();
    Condition empty = lock.newCondition();
    Condition fill = lock.newCondition();


    public void meterDona(String name, Baker pastelero){

        lock.lock();

        try{
            while(donas.size()==5){
                System.out.printf("El pastelero %s iba a introducir una dona pero la bandeja estaba llena. :/ %n",pastelero.nombre);
                empty.await();
            }

            donas.add(new Dona(++pastelero.counter));
            System.out.printf("El pastelero %s ha añadido una dona, la número %s. ^^%n",name,pastelero.counter);

            fill.signalAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally{
            lock.unlock();
        }

    }

    public synchronized Dona comerDona(String name){

        Dona donaSacada = null;

        lock.lock();

        try{
            while(donas.size()==0){
                System.out.printf("%s ha intentado comerse una dona pero no había :(%n",name);

                fill.await();
            }

            System.out.printf("%s se ha comido una dona. La dona número %s.%n",name, donas.get(0).toString());
            donaSacada = donas.remove(0);

            empty.signalAll();

        }catch(InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

        return donaSacada;
    }

}
