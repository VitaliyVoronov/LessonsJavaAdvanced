package ua.itea.homeWorkThreads.bank;

/**
 *
 */
public class MoneyReplenishmentDemo {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = Bank.loadMyBank();

        System.out.println(bank.getAccounts()[0].getBalance());  // my account balance BEFORE replenishment
        Transaction[] list = new Transaction[] {
                new Transaction(Transaction.Type.CASH_REPLENISHMENT, 120, bank.getAccounts()[0], null),
                new Transaction(Transaction.Type.CASH_REPLENISHMENT, 80, bank.getAccounts()[0], null),
                new Transaction(Transaction.Type.CASH_REPLENISHMENT, 160, bank.getAccounts()[0], null),
                new Transaction(Transaction.Type.CASH_REPLENISHMENT, 240, bank.getAccounts()[0], null),
                new Transaction(Transaction.Type.CASH_REPLENISHMENT, 300, bank.getAccounts()[0], null),
                new Transaction(Transaction.Type.CASH_REPLENISHMENT, 100, bank.getAccounts()[0], null),
        };

        Thread[] threads = new Thread[list.length];
        for (int i = 0; i < threads.length; i++) {
            Transaction[] sublist = new Transaction[]{list[i]};
            threads[i] = new Thread(new TransactionProcessor(sublist, bank));
        }

        for (Thread t : threads) {
            t.start();
        }

        for (Thread t : threads) {
            t.join();
        }
        // Thread.sleep(1000); // it won't help!
        System.out.println(bank.getAccounts()[0].getBalance());   // my account balance AFTER replenishment
    }
}
