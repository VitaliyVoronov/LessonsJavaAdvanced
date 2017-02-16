/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.thread.join;

import com.epam.training.thread.join.JoinThread;

public class JoinRunner {

    public static void main(String[] args) {
        JoinThread tr1 = new JoinThread("First");
        JoinThread tr2 = new JoinThread("Second");
        tr1.start();
        tr2.start();
        try {
            tr1.join();
            System.out.println("end main");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
