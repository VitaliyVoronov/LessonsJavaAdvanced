/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.thread.yield;

import java.util.logging.Level;
import java.util.logging.Logger;

public class YieldRunner {

    public static void main(String[] args) {
        new Thread() {
            public void run() {
                System.out.println("start 1");
                Thread.yield();         
                System.out.println("end 1");
            }
        }.start();
        new Thread() {
            public void run() {
                System.out.println("start 2");
                System.out.println("end 2");
            }
        }.start();
    }
}
