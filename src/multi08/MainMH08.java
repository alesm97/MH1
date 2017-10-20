package multi08;

public class MainMH08 {

    public static void main(String[] args) {

        Bandeja bandeja = new Bandeja();
        Pastelero pastelero = new Pastelero("Baldomero",bandeja);
        Cliente cliente1 = new Cliente("Germán Ginés",bandeja), cliente2 = new Cliente("Eufrasio",bandeja);

        Thread[] hilos = {new Thread(pastelero),new Thread(cliente1),new Thread(cliente2)};

        for(Thread hilo:hilos){
            hilo.start();
        }

    }

}
