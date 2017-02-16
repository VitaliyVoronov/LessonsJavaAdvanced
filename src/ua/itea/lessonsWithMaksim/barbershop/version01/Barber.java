package ua.itea.lessonsWithMaksim.barbershop.version01;

/**
 * Created by vitaliy on 12/4/16.
 */
public class Barber implements Runnable {

    private BarberShop barberShop;

    public Barber(BarberShop barberShop) {
        this.barberShop = barberShop;
    }

    @Override
    public void run() {
        try {
            barberShop.getBarberWaitRoom().waiting();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
