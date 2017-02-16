/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.thread.synchronization;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maksym
 */
public class BufferThread {

    static int counter = 0;
    static StringBuffer s = new StringBuffer(); // заменить на StringBuilder

    public static void main(String args[]) throws InterruptedException {
        new Thread() {
            public void run() {
                synchronized (s) {
                    while (BufferThread.counter++ < 3) {
                        s.append("A");
                        System.out.print("> " + counter + " ");
                        System.out.println(s);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(BufferThread.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } // конец synchronized-блока
            }
        }.start();
        Thread.sleep(100);
        while (BufferThread.counter++ < 6) {
            System.out.print("< " + counter + " ");
// в этом месте поток main будет ждать освобождения блокировки объекта s
            s.append("B");
            System.out.println(s);
        }
    }
}
