package ua.itea.homeWorkThreads.bank;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 */
public class TransactionProcessor implements Runnable {
    private Transaction[] list;
    private Bank bank;
    private static Lock myLock = new ReentrantLock();

    public TransactionProcessor(Transaction[] list, Bank bank) {
        this.list = list;
        this.bank = bank;
    }

    @Override
    public void run() {
        myLock.lock();
        try {
            for (Transaction t : list) {
                bank.execute(t);
            }
        } finally {
            myLock.unlock();
        }
    }
}
