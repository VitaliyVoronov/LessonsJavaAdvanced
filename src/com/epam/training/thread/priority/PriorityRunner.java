/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.training.thread.priority;

import com.epam.training.thread.priority.PriorThread;

public class PriorityRunner {
    public static void main(String[] args) {
        PriorThread min = new PriorThread("Min"); //1
        PriorThread max = new PriorThread("Max");//10
        PriorThread norm = new PriorThread("Norm");//5
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);
        min.start();
        norm.start();
        max.start();
    }

}
