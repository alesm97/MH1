package multi11;

public class Buyer implements Runnable{

    String nombre;
    Plate bandeja;

    public Buyer(String nombre, Plate bandeja) {
        this.nombre = nombre;
        this.bandeja = bandeja;
    }

    @Override
    public void run() {


        while(true){
            bandeja.comerDona(nombre);
        }

    }

}
