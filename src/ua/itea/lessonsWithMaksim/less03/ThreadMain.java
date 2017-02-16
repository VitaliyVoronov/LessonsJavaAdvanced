package ua.itea.lessonsWithMaksim.less03;

/**
 * Created by vitaliy on 12/2/16.
 */
public class ThreadMain {
    public static void main(String[] args) {
        Print print = new Print();
        Hall hall = new Hall(print);
        Thread t1 = new Thread(new Employer(hall));
        Thread t2 = new Thread(new Employer(hall));
        Thread t3 = new Thread(new Employer(hall));
        Thread t4 = new Thread(new Employer(hall));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }




}
