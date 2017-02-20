package ua.itea.homeWorkThreads.shop;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Shop Cart.
 * This class is not thread-safe.
 */
public class Cart {

    private Shop shop;
    private Product[] products;
    private static Lock myLock = new ReentrantLock();

    public Cart(Shop shop) {
        this.shop = shop;
    }

    Cart(Shop shop, Product[] products ) {
        this.shop = shop;
        this.products = products;
    }

    // NOT THREAD SAFE
    public void buyAll(MoneyAccount seller, MoneyAccount buyer) {
        // (1) should I acquire the lock here?
        new Thread(new Runnable() {
            @Override
            public void run() {
                // (2) should I acquire the lock here?
                myLock.lock();
                try {
                    if (buyer.getDebitBalance() >= getTotalPrice()) {
                        for (Product p : products) {
                            buyer.setDebitBalance(buyer.getDebitBalance() - p.getPrice());
                            seller.setDebitBalance(seller.getDebitBalance() + p.getPrice());
                            shop.markSold(p);
                        }
                    }
                } finally {
                    myLock.unlock();
                }
            }
        }).start();
    }

    // NOT THREAD SAFE
    public long getTotalPrice() {
        long sum = 0;
        for (Product p : products) {
            sum += p.getPrice();
        }
        return sum;
    }

    public void addProduct(Product product, int count) {
        // NOT IMPLEMENTED
        throw new RuntimeException("Not Implemented Exception");
    }

    public void removeProduct(Product product, int count) {
        // NOT IMPLEMENTED
        throw new RuntimeException("Not Implemented Exception");
    }
}
