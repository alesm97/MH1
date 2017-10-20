package multi08;

import java.util.ArrayList;

public class Bandeja {

    ArrayList<Dona> donas = new ArrayList<>();

    public synchronized void meterDona(String name, Pastelero pastelero){

        if(donas.size()<5){
            donas.add(new Dona(++pastelero.counter));
            System.out.printf("El pastelero %s ha añadido una dona, la número %s. ^^%n",name,pastelero.counter);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            notifyAll();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.printf("El pastelero %s iba a introducir una dona pero la bandeja estaba llena. :/ %n",pastelero.nombre);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }

    public synchronized Dona comerDona(String name){
        Dona donaSacada;

        while(donas.size() == 0){
            System.out.printf("%s ha intentado comerse una dona pero no había :(%n",name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("%s se ha comido una dona. La dona número %s.%n",name, donas.get(0).toString());
        donaSacada = donas.remove(0);
        notifyAll();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return donaSacada;
    }

}
