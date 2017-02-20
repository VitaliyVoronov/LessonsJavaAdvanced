package ua.itea.homeWorkThreads.shop;

/**
 *
 */
public class Shop {
    private Product[] availableProducts;

    public Shop(Product[] availableProducts) {
        this.availableProducts = availableProducts;
    }

    public Product[] getAvailableProducts() {
        return availableProducts;
    }

    public void markSold(Product product) {
        // NOT IMPLEMENTED
    }
}
