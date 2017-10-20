package multi11;

import multi08.Bandeja;
import multi08.Cliente;
import multi08.Pastelero;

public class MH11Main {

    public static void main(String[] args) {

        Plate bandeja = new Plate();
        Baker pastelero = new Baker("Baldomero",bandeja);
        Buyer cliente1 = new Buyer("Germán Ginés",bandeja), cliente2 = new Buyer("Eufrasio",bandeja);

        Thread[] hilos = {new Thread(pastelero),new Thread(cliente1),new Thread(cliente2)};

        for(Thread hilo:hilos){
            hilo.start();
        }

    }

}
