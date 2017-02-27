package ua.itea.homeWorkDesignPatterns.ObserverPattern;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/26/17
 */
public class Controller implements Observable {

    private List<Observer> observers;
    private String command;
    private Scanner scanner;

    public Controller(){
        observers = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserves() {
        for (int i = 0; i < observers.size(); i++){
            observers.get(i).update(command);
        }
    }

    public void scan(){
        writeThread();
        while (true){
            command = scanner.nextLine();
            if(command != null){
                notifyObserves();
            }
        }

    }

    private void writeThread(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
                while (true) {
                    System.out.println("Time: " + dateFormat.format(new Date()));
                    System.out.println("Enter you command:");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
