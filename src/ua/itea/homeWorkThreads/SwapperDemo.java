package ua.itea.homeWorkThreads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/20/17
 */
public class SwapperDemo {
    private static int a = 1;
    private static int b = 2;
    private static Lock myLock = new ReentrantLock();
    private static StringBuffer stringBuffer = new StringBuffer();

    static class Swapper implements Runnable {

        @Override
        public void run() {
            myLock.lock();
                stringBuffer.append("locked by " + Thread.currentThread().getName()+" nano: "+ System.nanoTime() + "\n");
            try {
                for (int i = 0; i < 101; i++) {
                    int t = a;
                    a = b;
                    b = t;
                }
            } finally {
                stringBuffer.append("unlocked by " + Thread.currentThread().getName() +" nano: "+ System.nanoTime() + "\n");
                myLock.unlock();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Swapper()).start();
        new Thread(new Swapper()).start();
        new Thread(new Swapper()).start();
        Thread.sleep(1000);
        System.out.println(a + " " + b);
        System.out.println(stringBuffer);
    }
}
