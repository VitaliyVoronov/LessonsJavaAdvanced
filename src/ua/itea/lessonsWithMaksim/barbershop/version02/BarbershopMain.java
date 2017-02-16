package ua.itea.lessonsWithMaksim.barbershop.version02;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by vitaliy on 12/5/16.
 */
public class BarbershopMain {

    private static Queue<Men> street = new LinkedList();

    public static void main(String[] args) {
        Men barber = new Men("barber");
        Barbershop barbershop = new Barbershop(3,barber);
        Men client1 = new Men("client1");
        Men client2 = new Men("client2");
        Men client3 = new Men("client3");
        Men client4 = new Men("client4");
        Men client5 = new Men("client5");
        street.offer(client1);
        street.offer(client2);
        street.offer(client3);
        street.offer(client4);
        street.offer(client5);
        OperatorCabinet operatorCabinet = new OperatorCabinet(barbershop);
        OperatorWaitRoom operatorWaitRoom = new OperatorWaitRoom(barbershop,street);
        Thread t1 = new Thread(operatorWaitRoom);
        Thread t2 = new Thread(operatorCabinet);
        t1.start();
        t2.start();
    }

}
