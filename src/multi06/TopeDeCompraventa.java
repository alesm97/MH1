package multi06;

public class TopeDeCompraventa {

    public static void main(String[] args) {

        Cine cine = new Cine();
        Comprador[] compradores = {new Comprador(cine,15,0,0), new Comprador(cine,0,10,0),new Comprador(cine,45,12,1)};

        for(Comprador comprador:compradores){
            comprador.start();
        }

        for(Comprador comprador:compradores){
            try {
                comprador.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(cine.toString());

    }

}
