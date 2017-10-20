package multi03;

public class Cinema {

    Integer chairs;

    public Cinema (Integer chairs){
        this.chairs=chairs;
    }


    public void buyTicket(){
        synchronized (chairs) {
            if (chairs == 0) {
            System.out.println("There are no available chairs, waiting.");
                try {
                    chairs.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                chairs--;
                System.out.printf("Ticket bought. Chairs remaining: %d%n", chairs);
            }
        }
    }

    public void sellTicket(){
        if(chairs==0){
            synchronized (chairs){
                chairs++;
                chairs.notifyAll();
                System.out.printf("Ticket sold. Chairs remaining: %d%n",chairs);
            }
        }else{
            chairs++;
            System.out.printf("Ticket sold. Chairs remaining: %d%n",chairs);
        }


    }


}
