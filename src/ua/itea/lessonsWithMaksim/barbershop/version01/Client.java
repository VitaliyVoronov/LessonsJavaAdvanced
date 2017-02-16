package ua.itea.lessonsWithMaksim.barbershop.version01;

/**
 * Created by vitaliy on 11/30/16.
 */
public class Client implements Runnable {

    private BarberShop barberShop;

    public Client(BarberShop barberShop) {
        this.barberShop = barberShop;
    }

    @Override
    public void run() {
        if (barberShop.getBarberWaitRoom().getNumFreePlaces() == barberShop.getBarberWaitRoom().getMaxPlaces()
                && !barberShop.getBarberCabinet().isClient()){
            try {
                barberShop.getBarberCabinet().haircut();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (barberShop.getBarberWaitRoom().getNumFreePlaces() > 0){
            try {
                barberShop.getBarberWaitRoom().waiting();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + ": I am going to another barbershop!");
        }


    }
}
