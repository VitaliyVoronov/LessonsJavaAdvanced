package ua.itea.homeWorkThreads.bank;

/**
 *
 */
public class Account {
    private final String person;
    private long balance;

    public Account(String person, long balance) {
        this.person = person;
        this.balance = balance;
    }

    public String getPerson() {
        return person;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        delay(); // simulate extensive work :)
        this.balance = balance;
    }

    private static void delay() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
