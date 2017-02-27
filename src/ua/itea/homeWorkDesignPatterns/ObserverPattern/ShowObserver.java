package ua.itea.homeWorkDesignPatterns.ObserverPattern;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/26/17
 */
public class ShowObserver implements Observer {
    @Override
    public void update(String s) {
        if (s.equals("show")){
            System.out.println("Smile :)");
        }
    }
}
