package ua.itea.additionalLesson;

/**
 * Represents mobile model constants
 *
 * @author vitaliy
 * @version 1.0
 * @since 2/4/17
 */
public enum Mobile {

    IPHONE(30000), SAMSUNG(20000), ACER(10000);
    private int price;

    Mobile(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

}
