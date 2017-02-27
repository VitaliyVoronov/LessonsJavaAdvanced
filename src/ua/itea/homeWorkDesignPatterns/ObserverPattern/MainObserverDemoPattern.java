package ua.itea.homeWorkDesignPatterns.ObserverPattern;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/26/17
 */
public class MainObserverDemoPattern {
    public static void main(String[] args) {
        Controller controller = new Controller();

        CurrentTimeObserver currentTimeObserver = new CurrentTimeObserver();
        ExitObserver exitObserver = new ExitObserver();
        ShowObserver showObserver = new ShowObserver();

        controller.registerObserver(currentTimeObserver);
        controller.registerObserver(exitObserver);
        controller.registerObserver(showObserver);
        controller.scan();
    }
}
