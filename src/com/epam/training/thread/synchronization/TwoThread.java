/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.training.thread.synchronization;

public class TwoThread {
    public static void main(String[] args) {
        final StringBuffer s = new StringBuffer();
        new Thread(){
            public void run(){
                int i = 0;
                synchronized (s) {
                    while (i++ < 3){
                        s.append("A");
                        try{
                            sleep(100);
                        } catch (InterruptedException e){
                            System.err.print(e);
                        }
                        System.out.println(s);
                    }
                }
            }
        }.start();
        new Thread(){
            public void run(){
                int j = 0;
                synchronized (s){
                    while (j++ < 3){
                        s.append("B");
                        System.out.println(s);
                    }
                }
            }
        }.start();
    }

}
