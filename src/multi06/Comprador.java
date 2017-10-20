package multi06;

public class Comprador extends Thread{

    Cine cine;
    int compradas, vendidas, sala;

    public Comprador(Cine cine, int compradas, int vendidas, int sala){
        this.cine=cine;
        this.compradas=compradas;
        this.vendidas=vendidas;
        this.sala=sala;
    }

    @Override
    public void run() {
        cine.comprar(compradas,sala);
        cine.vender(vendidas,sala);
    }
}
