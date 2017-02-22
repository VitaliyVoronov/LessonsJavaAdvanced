package ua.itea.homeWorkThreads.bank;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Decision for task three from tasks file
 *
 * @author vitaliy
 * @version 1.0
 * @since 2/22/17
 */
public class MoneyLifeDemoTask3 {

    private static Account account = new Account("Vasya", 2000);
    private static Lock myLock = new ReentrantLock();
    private static Condition moneyAvelable = myLock.newCondition();

    public static void main(String[] args) throws InterruptedException {

        Thread put = new MoneyLifeDemoTask3.MyThreadPutMoney();
        Thread take1 = new MoneyLifeDemoTask3.MyThreadTakeMoney();
        Thread take2 = new MoneyLifeDemoTask3.MyThreadTakeMoney();
        Thread take3 = new MoneyLifeDemoTask3.MyThreadTakeMoney();

        put.start();
        take1.start();
        take2.start();
        take3.start();
        Thread.sleep(4000);

        System.out.println("Balance: "+account.getBalance());
    }

    private static class MyThreadPutMoney extends Thread {

        @Override
        public void run() {
            myLock.lock();
            try {
                while (account.getBalance() > 0) {
                    try {
                        System.out.println(Thread.currentThread().getName()+" waiting...");
                        moneyAvelable.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+" awoke");
                account.putMoney(2000);
                moneyAvelable.signalAll();
            } finally {
                myLock.unlock();
            }
        }
    }

    private static class MyThreadTakeMoney extends Thread {

        @Override
        public void run() {
            myLock.lock();
            try {
                while (account.getBalance() == 0) {
                    try {
                        moneyAvelable.signalAll();
                        System.out.println(Thread.currentThread().getName()+" waiting...");
                        moneyAvelable.await();
                        System.out.println(Thread.currentThread().getName()+" awoke");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                account.takeMoney(1000);
            }finally {
                myLock.unlock();
            }
        }
    }
}
