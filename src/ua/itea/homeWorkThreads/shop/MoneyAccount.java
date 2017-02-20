package ua.itea.homeWorkThreads.shop;

/**
 *
 */
public class MoneyAccount {
    private long number;
    private short pin;
    private long debitBalance;
    private int creditBalance;

    public MoneyAccount(long number, short pin, long debitBalance, int creditBalance) {
        this.number = number;
        this.pin = pin;
        this.debitBalance = debitBalance;
        this.creditBalance = creditBalance;
    }

    //getters
    public long getNumber() {
        return number;
    }

    public short getPin() {
        return pin;
    }

    public long getDebitBalance() {
        return debitBalance;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    //setters
    public void setDebitBalance(long debitBalance) {
        this.debitBalance = debitBalance;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }
}
