package ua.itea.homeWorkDesignPatterns.ObserverPattern;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/26/17
 */
public interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserves();
}
