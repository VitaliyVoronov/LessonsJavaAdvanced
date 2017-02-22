package ua.itea.homeWorkThreads.bank;

/**
 * Decision for task one from tasks file
 *
 * @author vitaliy
 * @version 1.0
 * @since 2/22/17
 */
public class MoneyLifeDemoTask1 {

    private static Account account = new Account("Vasya", 10000);

    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        while (account.getBalance() == 10000) {
            runOperationsTwoThreads();
            ++count;
        }
        System.out.println(account.getBalance());
        System.out.println("count: "+count);
    }

    public static void runOperationsTwoThreads(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    account.putMoney(1000);
                    System.out.println(account.getBalance());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    account.takeMoney(1000);
                    System.out.println(account.getBalance());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
