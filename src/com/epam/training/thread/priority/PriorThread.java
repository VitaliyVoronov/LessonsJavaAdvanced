/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.training.thread.priority;

public class PriorThread extends Thread{
    public PriorThread(String name){
        super(name);
    }
    public void run(){
        for (int i = 0; i < 71; i++){
            System.out.println(getName() + " " + i);
            try{
                sleep(100);
            }catch (InterruptedException e){
                System.err.print("Error" + e);
            }
        }
//        System.out.println("Hello");
    }
}
