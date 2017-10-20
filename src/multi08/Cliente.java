package multi08;


public class Cliente implements Runnable{

    String nombre;
    Bandeja bandeja;

    public Cliente(String nombre, Bandeja bandeja) {
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
