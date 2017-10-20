package multi06;

import java.util.Arrays;

public class Cine {

    int[] salas = {100, 50, 50};
    Object[] monitor = {new Object(), new Object(), new Object()};

    public void comprar(int entradas, int sala) {

        synchronized (monitor[sala]) {
            salas[sala] -= entradas;
            System.out.printf("Entrada para la sala %d comprada. Restantes: %d%n",sala,salas[sala]);
        }

    }

    public void vender(int entradas, int sala) {
        synchronized (monitor[sala]) {
            salas[sala] += entradas;
            System.out.printf("Entrada para la sala %d vendida. Restantes: %d%n",sala,salas[sala]);
        }
    }

    @Override
    public String toString() {
        return "Cine{" +
                "salas=" + Arrays.toString(salas) +
                '}';
    }
}
