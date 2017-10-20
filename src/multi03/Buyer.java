package multi03;

public class Buyer extends Thread{

    Cinema cinema;
    int buys,sells;

    public Buyer(Cinema cinema, int buys, int sells){
        this.cinema=cinema;
        this.buys=buys;
        this.sells=sells;
    }

    public void run(){
        for(int count=0;count<buys;count++)
        {
            cinema.buyTicket();
        }

        for(int count=0;count<sells;count++)
            cinema.sellTicket();
    }

}
