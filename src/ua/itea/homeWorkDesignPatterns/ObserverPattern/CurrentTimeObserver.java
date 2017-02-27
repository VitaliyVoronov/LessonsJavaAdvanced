package ua.itea.homeWorkDesignPatterns.ObserverPattern;

import java.util.Date;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/26/17
 */
public class CurrentTimeObserver implements Observer {
    @Override
    public void update(String s) {
        if (s.equals("now")){
            Date date = new Date();
            System.out.println(date);
        }
    }
}
