package ua.itea.homeWorkThreads.bank;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/20/17
 */
public class MoneyLifeDemo {

    private static Account account = new Account("Vasya", 10000);
    private static Lock myLock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

        Thread put = new MyThreadPutMoney();
        Thread take1 = new MyThreadTakeMoney();
        Thread take2 = new MyThreadTakeMoney();
        Thread take3 = new MyThreadTakeMoney();

//        while (account.getBalance() == 10000){
            put.start();
            take1.start();
            take2.start();
            take3.start();
            Thread.sleep(1000);

//            runOperationsTwoThreads();
//        }

        System.out.println(account.getBalance());
    }

    private static class MyThreadPutMoney extends Thread {

        @Override
        public void run() {
            myLock.lock();
                for (int i = 0; i < 10; i++) {
                    account.putMoney(1000);
                    System.out.println(account.getBalance());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            myLock.unlock();
        }
    }

    private static class MyThreadTakeMoney extends Thread {

        @Override
        public void run() {
            myLock.lock();
            for (int i = 0; i < 10; i++) {
                account.takeMoney(1000);
                System.out.println(account.getBalance());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            myLock.unlock();

        }
    }

//    public static void runOperationsTwoThreads(){
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    account.putMoney(1000);
//                    System.out.println(account.getBalance());
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    account.takeMoney(1000);
//                    System.out.println(account.getBalance());
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }).start();
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
}
