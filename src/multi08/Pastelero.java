package multi08;

public class Pastelero implements Runnable{

    String nombre;
    Bandeja bandeja;
    static int counter=0;

    public Pastelero(String nombre, Bandeja bandeja) {
        this.nombre = nombre;
        this.bandeja = bandeja;
    }


    @Override
    public void run() {

        while(true){
            bandeja.meterDona(nombre,this);
        }
    }
}
