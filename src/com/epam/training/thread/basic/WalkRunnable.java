/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.training.thread.basic;

public class WalkRunnable implements Runnable{
    public void run(){
        for (int i = 0; i < 8; i++){
            System.out.println("Walking");
            try{
                Thread.sleep(400);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
