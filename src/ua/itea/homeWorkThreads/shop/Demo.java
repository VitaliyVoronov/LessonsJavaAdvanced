package ua.itea.homeWorkThreads.shop;

/**
 * Demonstrates Race Condition
 * Program stops when Race Condition detected
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Product[] product = {
                new Product("Tickles Scholer Teddy", 199),
                new Product("Grey Mother Elephant Stuffed Soft Plush Toy Love Girl 30 cm", 150),
                new Product("Plush Toy Kids Birthday Black Panda 26 cm", 110),
                new Product("Funskool Digger the Dog", 317),
                new Product("Dimpy Stuff Cute Pink and Cream Bear Couple Soft Toy, Pink (9.8-inch)", 290),
                new Product("Amardeep And Co Amardeep Soft Baby Rattle Bunny", 270),
                new Product("Funskool Twirlly Whirlly Turtle", 164),
        };
        MoneyAccount seller;
        do {
            Shop shop = new Shop(product);
            seller = new MoneyAccount(7000_1245_0014_8469L, (short)0, 0, 0);

            MoneyAccount buyer1 = new MoneyAccount(3365_3425_2370_8000L, (short)1234, 2000, 0);
            MoneyAccount buyer2 = new MoneyAccount(1111_3425_2370_8000L, (short)1234, 2000, 0);
            Cart cart1 = new Cart(shop, product );
            // System.out.println(cart1.getTotalPrice());         // 1500
            Cart cart2 = new Cart(shop, product);
            // System.out.println(cart2.getTotalPrice());         // 1500

            cart1.buyAll(seller, buyer1);
            cart2.buyAll(seller, buyer2);

            Thread.sleep(100);
            System.out.print('.'); // update our 'progress bar'
        } while(seller.getDebitBalance() == 3000);

        System.out.println("\n" + seller.getDebitBalance());
    }
}
