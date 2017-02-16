package ua.itea.lessonsWithMaksim.barbershop.version01;

/**
 * Created by vitaliy on 11/30/16.
 */
public class BarbershopMain {
    public static void main(String[] args) {
        BarberShop barberShop = new BarberShop(3);
        Thread barber = new Thread(new Barber(barberShop),"barber");
        Thread client1 = new Thread(new Client(barberShop));
        Thread client2 = new Thread(new Client(barberShop));
        Thread client3 = new Thread(new Client(barberShop));
        Thread client4 = new Thread(new Client(barberShop));
        Thread client5 = new Thread(new Client(barberShop));
        Thread client6 = new Thread(new Client(barberShop));
        barber.start();
        client1.start();
        client2.start();
        client3.start();
        client4.start();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        client5.start();
        client6.start();
    }
}
