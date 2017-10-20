package multi05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends Thread{

    private SimpleDateFormat formateador;

    @Override
    public void run() {
        formateador = new SimpleDateFormat("HH:mm:ss");

        while (!this.isInterrupted()) {
            System.out.println(formateador.format(new Date()));
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
        return;
    }
}
