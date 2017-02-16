package ua.itea.lessonsWithMaksim.barbershop.version02;

/**
 * Created by vitaliy on 12/5/16.
 */
public class OperatorCabinet implements Runnable {

    private Barbershop barbershop;

    public OperatorCabinet(Barbershop barbershop){
        this.barbershop = barbershop;
    }

    @Override
    public void run() {
        while (true) {
            Men client = barbershop.getWaitRoom().takeClientFromQueue();
            barbershop.getWaitRoom().getQueue().notifyAll();
            if (client != null) {
                barbershop.getCabinet().addClient(client);
                barbershop.getCabinet().haircut();
            } else {
                break;
            }
        }

    }
}
