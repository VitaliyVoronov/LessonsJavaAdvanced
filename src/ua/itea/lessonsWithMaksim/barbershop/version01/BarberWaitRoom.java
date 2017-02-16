package ua.itea.lessonsWithMaksim.barbershop.version01;

/**
 * Created by vitaliy on 11/30/16.
 */
public class BarberWaitRoom {

    private BarberCabinet barberCabinet;
    private int numFreePlaces;
    private int maxPlaces;

    public BarberWaitRoom(int numFreePlaces, BarberCabinet barberCabinet){
        this.numFreePlaces = numFreePlaces;
        this.barberCabinet = barberCabinet;
        this.maxPlaces = numFreePlaces;
    }

    public void waiting() throws InterruptedException {
        synchronized (this){
            this.notifyAll();
        }
        if (!Thread.currentThread().getName().equals("barber")) {
            synchronized (barberCabinet) {
                --numFreePlaces;
                System.out.println(Thread.currentThread().getName() + ": I am waiting!");
                System.out.println(numFreePlaces);
                barberCabinet.wait();
                System.out.println(Thread.currentThread().getName() + ": I am going to cut");
                ++numFreePlaces;
                barberCabinet.haircut();
                if (numFreePlaces == maxPlaces) {
                    barberCabinet.setClientInWaitRoom(false);
                }
                System.out.println(Thread.currentThread().getName() + " exit from wait room");
            }
        } else {
            synchronized (this) {
                while (true) {
                    barberCabinet.haircut();
                    System.out.println(Thread.currentThread().getName() + ": go to sleep");
                    wait();
                    System.out.println("dddddddddddd");
                }
            }
        }
    }

    public int getNumFreePlaces() {
        return numFreePlaces;
    }

    public int getMaxPlaces() {
        return maxPlaces;
    }
}
