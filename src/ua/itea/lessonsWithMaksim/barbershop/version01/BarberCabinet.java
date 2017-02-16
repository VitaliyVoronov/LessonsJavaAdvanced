package ua.itea.lessonsWithMaksim.barbershop.version01;

/**
 * Created by vitaliy on 11/29/16.
 */
public class BarberCabinet {

    private boolean isClient;
    private boolean isBarber;
    private boolean isClientInWaitRoom = true;

    public void haircut() throws InterruptedException {
        synchronized (this){
            if (Thread.currentThread().getName().equals("barber")){
                isBarber = true;
                System.out.println(isBarber);
                while (isClientInWaitRoom || isClient){
                    wait();
                }
                System.out.println(isClientInWaitRoom);
                System.out.println(isClient);
                isBarber = false;

            } else {
                isClient = true;
                System.out.println(Thread.currentThread().getName() + " cutting");
                wait(3000);
                isClient = false;
                this.notify();
                System.out.println(Thread.currentThread().getName() + " exit from cabinet");

            }
        }

    }

    public boolean isClient(){
        return isClient;
    }

    public void setClientInWaitRoom(boolean clientInWaitRoom) {
        isClientInWaitRoom = clientInWaitRoom;
    }
}