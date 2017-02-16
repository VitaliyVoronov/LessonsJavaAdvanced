package ua.itea.lessonsWithMaksim.barbershop.version02;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by vitaliy on 12/5/16.
 */
public class WaitRoom {

    private volatile BlockingQueue<Men> queue;
    private int capacity;
    private volatile int countClients;

    public WaitRoom(int waitRoomCapacity){
        queue = new ArrayBlockingQueue<>(3);
        capacity = waitRoomCapacity;
        countClients = 0;
    }

    public boolean addClientToQueue(Men client){
     if (countClients < capacity){
         ++countClients;
         System.out.println(client.getName()+" in wait room");
         queue.add(client);
         return true;
     } else {
         return false;
     }
    }

    public Men takeClientFromQueue() {
        if (countClients != 0) {
            --countClients;
        }
        return queue.poll();
    }

    public Queue<Men> getQueue() {
        return queue;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountClients() {
        return countClients;
    }

    public String getNameClient(){
        return queue.peek().getName();
    }
}
