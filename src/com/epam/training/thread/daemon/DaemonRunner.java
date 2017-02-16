/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.training.thread.daemon;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DaemonRunner {
    public static void main(String[] args) {
        SimpleThread usual = new SimpleThread();
        SimpleThread daemon = new SimpleThread();
        daemon.setDaemon(true);
        daemon.start();
        usual.start();
          System.out.println(" main");
//        try {
//            daemon.join();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(DaemonRunner.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
