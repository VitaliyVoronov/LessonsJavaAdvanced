package ua.itea.lessonsWithMaksim.barbershop.version02;

import java.util.Queue;

/**
 * Created by vitaliy on 12/5/16.
 */
public class OperatorWaitRoom implements Runnable{

    private volatile Queue<Men> street;
    private Barbershop barbershop;

    public OperatorWaitRoom(Barbershop barbershop, Queue<Men> street){
        this.barbershop = barbershop;
        this.street = street;
    }

    @Override
    public void run() {
        while (street.size() > 0) {
            Men client = street.poll();
            if (client != null) {
                if (barbershop.getWaitRoom().addClientToQueue(client)){

                } else {
                    System.out.println(client.getName()+" go to another barbershop!");
                }
            } else {
                break;
            }
        }
        System.out.println("No more client!");
    }
}
