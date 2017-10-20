package multi01;

public class LilTable extends Thread{

    int number;

    public LilTable(int number) {
        this.number=number;
    }

    @Override
    public void run() {
        System.out.printf("Multiplication Table of %d.%n",number);
        for(int cont=1;cont<=10;cont++){
            System.out.printf("%d x %d = %d %n",number,cont,number*cont);
        }
    }
}
