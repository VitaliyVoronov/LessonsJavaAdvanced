package ua.itea.homeWorkDesignPatterns.ObserverPattern;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/26/17
 */
public class ExitObserver implements Observer {
    @Override
    public void update(String s) {
        if (s.equals("exit")) {
            System.out.println("Program closed");
            System.exit(0);
        }
    }
}
