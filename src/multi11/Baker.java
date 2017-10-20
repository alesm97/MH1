package multi11;

public class Baker implements Runnable{

    String nombre;
    Plate bandeja;
    static int counter=0;

    public Baker(String nombre, Plate bandeja) {
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
