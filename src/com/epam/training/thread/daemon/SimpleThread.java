/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.thread.daemon;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        try {
            if (isDaemon()){                
                System.out.println("start-deamon");
                sleep(1000);
            } else {
                System.out.println("start");
            }
        } catch (InterruptedException e) {
            System.err.print("Error" + e);
        } finally {
            if (!isDaemon()) {
                System.out.println("end");
            } else {
                System.out.println("end deamon");
            }
        }
    }
}
