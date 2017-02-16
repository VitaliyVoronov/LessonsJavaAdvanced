package ua.itea.lessonsWithMaksim.less03;

/**
 * Created by vitaliy on 12/2/16.
 */
public class Hall {

    private final Print print;
    private boolean freePrint;

    public Hall(Print print){
        this.print = print;
        freePrint = true;
    }

    public void waitRoom(){
        synchronized (print) {
            try {
                System.out.println(Thread.currentThread().getName()+" I am waiting");
                print.wait();
                System.out.println(Thread.currentThread().getName()+" I am not waiting");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void goToPrint(){
        synchronized (print) {
            freePrint = false;
            try {
                print.print();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            freePrint = true;
            print.notify();
        }
    }

    public boolean isFreePrint() {
        return freePrint;
    }
}
