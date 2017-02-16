package ua.itea.lessonsWithMaksim.less03;

/**
 * Created by vitaliy on 12/2/16.
 */
public class Print {

    public Print(){
    }

    public synchronized void print() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" I am printing");
        wait(1000);
        System.out.println(Thread.currentThread().getName()+" I am not printing");
    }
}
