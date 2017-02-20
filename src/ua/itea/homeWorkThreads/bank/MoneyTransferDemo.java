package ua.itea.homeWorkThreads.bank;

import java.util.Random;

/**
 *
 */
public class MoneyTransferDemo {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = Bank.loadMyBank();

        System.out.println(bank.getTotalBalance()); // total bank balance BEFORE transferring
        Thread[] processors = new Thread[5];
        for (int i = 0; i < 5; i++) {
            Transaction[] list = generateRTTList(bank);
            processors[i] = new Thread(new TransactionProcessor(list, bank));
        }

        for (Thread thread : processors) {
            thread.start();
        }

        for (Thread thread : processors) {
            thread.join();
        }

        System.out.println(bank.getTotalBalance()); // total bank balance AFTER transferring

    }

    /**
     * Generates Random List of TRANSFER Transactions
     */
    private static Transaction[] generateRTTList(Bank bank) {
        final Random rnd = new Random();
        final int N = 10; // how many transactions will be created
        Transaction[] list = new Transaction[N];
        for (int i = 0; i < 10; i++) {
            int srcID = rnd.nextInt(bank.getAccounts().length);
            int destID = rnd.nextInt(bank.getAccounts().length);
            list[i] = new Transaction(
                    Transaction.Type.TRANSFER,
                    rnd.nextInt(5000) + 100,
                    bank.getAccounts()[srcID],
                    bank.getAccounts()[destID] );
        }
        return list;
    }
}
